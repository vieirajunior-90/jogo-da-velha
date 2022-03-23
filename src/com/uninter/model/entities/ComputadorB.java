package com.uninter.model.entities;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ComputadorB extends Computador {

    private Tabuleiro tabuleiro;

    public ComputadorB(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public int realizarJogada(){
        Random random = new Random();

        if (tabuleiro.verificarPosicao(5) == true) {
            return 5;
        }
        else if (tabuleiro.verificarPosicao(1) == true
                || tabuleiro.verificarPosicao(3) == true
                || tabuleiro.verificarPosicao(7) == true
             || tabuleiro.verificarPosicao(9) == true) {

           List<Integer> posicoes = Arrays.asList(1, 3, 7, 9);


           return posicoes.get(random.nextInt(posicoes.size()));

        }
        else{
            return random.nextInt(9) + 1;
        }
    }
}
