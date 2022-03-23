package com.uninter.model.entities;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ComputadorC extends Computador {

    private Tabuleiro tabuleiro;
    private static Integer count = 0;

    public ComputadorC(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public int realizarJogada() {
        Random random = new Random();

        if (count % 2 == 0) {
            count++;
            if (tabuleiro.verificarPosicao(1) == true
                    || tabuleiro.verificarPosicao(3) == true
                    || tabuleiro.verificarPosicao(5) == true
                    || tabuleiro.verificarPosicao(7) == true
                    || tabuleiro.verificarPosicao(9) == true) {

                List<Integer> posicoes = Arrays.asList(1, 3, 5, 7, 9);

                return posicoes.get(random.nextInt(posicoes.size()));
            }
        }
        else {
            count++;
            if (tabuleiro.verificarPosicao(2) == true
                    || tabuleiro.verificarPosicao(4) == true
                    || tabuleiro.verificarPosicao(6) == true
                    || tabuleiro.verificarPosicao(8) == true) {

                List<Integer> posicoes = Arrays.asList(2, 4, 6, 8);

                return posicoes.get(random.nextInt(posicoes.size()));
            }
        }
        return 0;
    }
}
