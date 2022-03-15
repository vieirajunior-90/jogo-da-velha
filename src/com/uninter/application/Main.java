package com.uninter.application;

import com.uninter.entities.Computador;
import com.uninter.entities.Jogador;
import com.uninter.entities.Tabuleiro;

import java.util.ArrayList;
import java.util.List;

/*
    programa: Jogo da velha
    autor: Junior Vieira
    data: 15/03/2022
    descrição: Jogo da velha com IA implementando os conceitos de classes aprendido durante a disciplina de
    Programação Orientada a Objetos
*/

public class Main {
    static boolean isWinner;

    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("\t\tJogo da Velha");
        System.out.println("=============================\n");

        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.mostrarTabuleiro();

        Jogador jogador = new Jogador();
        Computador Computador = new Computador();


        // Fluxo principal do programa
        while(true) {
            if(isWinner) {
                break;
            }


            while(true) {
               int posicaoJogador = jogador.realizarJogada();
                boolean condicaoJogador = tabuleiro.verificarPosicao(posicaoJogador);

                if(condicaoJogador) {
                    tabuleiro.marcarPosicao(posicaoJogador, jogador.PECA_JOGADOR);
                    jogador.adicionarPosicao(posicaoJogador);
                    isWinner = tabuleiro.condicaoDeVitoria(jogador.getJogadorPosicoes());

                    if(isWinner) {
                        tabuleiro.mostrarTabuleiro();
                        System.out.println("\nParabéns, você venceu!");
                        break;
                    }
                    else if(jogador.getJogadorPosicoes().size() + Computador.getComputadorPosicoes().size() == 9) {
                        System.out.println("Deu Velha!");
                        break;
                    }

                    break;

                } else {
                    System.out.println("Posição inválida, tente novamente");
                }
            }

            while (true) {
                if(isWinner) {
                    break;
                }

                int posicaoComputador = Computador.realizarJogada();
                boolean condicaoComputador = tabuleiro.verificarPosicao(posicaoComputador);

                if(condicaoComputador) {
                    tabuleiro.marcarPosicao(posicaoComputador, Computador.PECA_COMPUTADOR);
                    Computador.adicionarPosicao(posicaoComputador);
                    isWinner = tabuleiro.condicaoDeVitoria(Computador.getComputadorPosicoes());

                    if(isWinner) {
                        tabuleiro.mostrarTabuleiro();
                        System.out.println("\nLamento! Você perdeu!");
                        break;
                    }
                    break;
                }
            }

            tabuleiro.mostrarTabuleiro();
        }

    }
}
