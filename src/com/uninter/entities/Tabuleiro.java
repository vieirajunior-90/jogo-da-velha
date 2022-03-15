package com.uninter.entities;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tabuleiro {
    private static Character[][] tabuleiro;

    public Tabuleiro() {
        tabuleiro = new Character[][]
                {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};
    }

    public void mostrarTabuleiro(){
        for (Character[] row : tabuleiro) {
            for (Character c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public void marcarPosicao(int posicao, Character jogador){
        Character symbol = jogador;

        switch (posicao) {
            case 1:
                tabuleiro[0][0] = symbol;
                break;
            case 2:
                tabuleiro[0][2] = symbol;
                break;
            case 3:
                tabuleiro[0][4] = symbol;
                break;
            case 4:
                tabuleiro[2][0] = symbol;
                break;
            case 5:
                tabuleiro[2][2] = symbol;
                break;
            case 6:
                tabuleiro[2][4] = symbol;
                break;
            case 7:
                tabuleiro[4][0] = symbol;
                break;
            case 8:
                tabuleiro[4][2] = symbol;
                break;
            case 9:
                tabuleiro[4][4] = symbol;
                break;
            default:
                break;
        }
    }

    public boolean verificarPosicao(int posicao){
        switch (posicao) {
            case 1:
                return tabuleiro[0][0] == ' ';
            case 2:
                return tabuleiro[0][2] == ' ';
            case 3:
                return tabuleiro[0][4] == ' ';
            case 4:
                return tabuleiro[2][0] == ' ';
            case 5:
                return tabuleiro[2][2] == ' ';
            case 6:
                return tabuleiro[2][4] == ' ';
            case 7:
                return tabuleiro[4][0] == ' ';
            case 8:
                return tabuleiro[4][2] == ' ';
            case 9:
                return tabuleiro[4][4] == ' ';
            default:
                return false;
        }
    }

    public boolean condicaoDeVitoria(ArrayList<Integer> posicoes){
        List linha1 = Arrays.asList(1,2,3);
        List linha2 = Arrays.asList(4,5,6);
        List linha3 = Arrays.asList(7,8,9);
        List coluna1 = Arrays.asList(1,4,7);
        List coluna2 = Arrays.asList(2,5,8);
        List coluna3 = Arrays.asList(3,6,9);
        List diagonal1 = Arrays.asList(1,5,9);
        List diagonal2 = Arrays.asList(3,5,7);

        List<List> listaDeCondicoes = new ArrayList<>();
        listaDeCondicoes.addAll(Arrays.asList(linha1,linha2,linha3,coluna1, coluna2, coluna3, diagonal1, diagonal2));

        for (List lista : listaDeCondicoes) {
            if(posicoes.containsAll(lista)){
                return true;
            }
        }
        return false;
    }
}
