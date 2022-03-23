package com.uninter.application;

import com.uninter.model.entities.*;

/*
    programa: Jogo da velha
    autor: Junior Vieira
    data: 15/03/2022
    descrição: Jogo da velha com IA implementando os conceitos de classes aprendido durante a disciplina de
    Programação Orientada a Objetos

    A mini-documentação do código está na raiz do projeto em um README.md
*/

public class Main {

    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("\t\tJogo da Velha");
        System.out.println("=============================\n");


        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.modelo();

        Jogador jogador = new Jogador();
        Computador computador = new ComputadorC(tabuleiro);

        FluxoDoJogo fluxoDoJogo = new FluxoDoJogo(jogador, computador, tabuleiro);

        // Fluxo principal do programa
        fluxoDoJogo.jogar();
    }
}
