package com.uninter.application;

import com.uninter.entities.*;

import java.util.ArrayList;
import java.util.List;

/*
    programa: Jogo da velha
    autor: Junior Vieira
    data: 15/03/2022
    descrição: Jogo da velha com IA implementando os conceitos de classes aprendido durante a disciplina de
    Programação Orientada a Objetos

    A mini-documentação do código está na raiz do projeto em um README.md
*/

public class Main {
    static boolean isWinner;

    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("\t\tJogo da Velha");
        System.out.println("=============================\n");

        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.modelo();

        Jogador jogador = new Jogador();
        Computador computador = new ComputadorC(tabuleiro);


        // Fluxo principal do programa
        boolean isGameOver = false;
        while(true) {
            if(isWinner || isGameOver) {
                break;
            }

            while(true) {
               try {
                   int posicaoJogador = jogador.realizarJogada();
                    boolean condicaoJogador = tabuleiro.verificarPosicao(posicaoJogador);

                    if(condicaoJogador) {
                        tabuleiro.marcarPosicao(posicaoJogador, jogador.PECA_JOGADOR);
                        jogador.adicionarPosicao(posicaoJogador);
                        isWinner = tabuleiro.condicaoDeVitoria(jogador.getJogadorPosicoes());

                        if(isWinner) {
                            tabuleiro.mostrarTabuleiro();
                            System.out.println("\nPARABENS! VOCÊ VENCEU!");
                            break;
                        }
                        else if(jogador.getJogadorPosicoes().size() + computador.getComputadorPosicoes().size() == 9) {
                            System.out.println("DEU VELHA!");
                            isGameOver = true;
                        }
                        break;

                    } else {
                        System.out.println("POSIÇÃO INVÁLIDA!");
                    }
               } catch (Exception e) {
                       System.out.println("VOCÊ NÃO PODE INSERIR LETRAS, APENAS NÚMEROS DE 1 A 9!");
               }
            }

            while (true) {
                if(isWinner || isGameOver) {
                    break;
                }

                int posicaoComputador = computador.realizarJogada();
                boolean condicaoComputador = tabuleiro.verificarPosicao(posicaoComputador);

                if(condicaoComputador) {
                    tabuleiro.marcarPosicao(posicaoComputador, computador.PECA_COMPUTADOR);
                    computador.adicionarPosicao(posicaoComputador);
                    isWinner = tabuleiro.condicaoDeVitoria(computador.getComputadorPosicoes());

                    if(isWinner) {
                        tabuleiro.mostrarTabuleiro();
                        System.out.println("\nVOCÊ PERDEU!");
                        break;
                    }
                    break;
                }
            }

            tabuleiro.mostrarTabuleiro();
        }

    }
}
