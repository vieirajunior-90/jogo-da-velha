package com.uninter.model.entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogador {
    public final String PECA_JOGADOR = " X ";
    private ArrayList<Integer> jogadorPosicoes = new ArrayList<>();

    public int realizarJogada(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a posição da peça (1-9): ");
        return sc.nextInt();
    }

    public void adicionarPosicao(int posicao){
        jogadorPosicoes.add(posicao);
    }

    public ArrayList<Integer> getJogadorPosicoes(){
        return jogadorPosicoes;
    }

}
