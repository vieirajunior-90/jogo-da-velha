package com.uninter.entities;

import java.util.ArrayList;
import java.util.Random;

public class Computador {
    public final Character PECA_COMPUTADOR = 'O';
    private ArrayList<Integer> computadorPosicoes = new ArrayList<>();

    public int realizarJogada(){
        Random r = new Random();
        return r.nextInt(9) + 1;
    }

    public void adicionarPosicao(int posicao){
        computadorPosicoes.add(posicao);
    }

    public ArrayList<Integer> getComputadorPosicoes(){
        return computadorPosicoes;
    }
}
