package com.uninter.entities;

import java.util.ArrayList;
import java.util.Random;

public abstract class Computador implements ComputadorInterface{
    public final String PECA_COMPUTADOR = " O ";
    private ArrayList<Integer> computadorPosicoes = new ArrayList<>();

    public int realizarJogada(){

        return 0;
    }

    public void adicionarPosicao(int posicao){
        computadorPosicoes.add(posicao);
    }

    public ArrayList<Integer> getComputadorPosicoes(){
        return computadorPosicoes;
    }
}
