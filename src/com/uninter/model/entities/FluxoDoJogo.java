package com.uninter.model.entities;

public class FluxoDoJogo {

    private Boolean isWinner = false;
    private Boolean isGameOver = false;

    private Jogador jogador;
    private Computador computador;
    private Tabuleiro tabuleiro;

    public FluxoDoJogo(Jogador jogador, Computador computador, Tabuleiro tabuleiro) {
        this.jogador = jogador;
        this.computador = computador;
        this.tabuleiro = tabuleiro;
    }

    public void jogar() {
        while (!isWinner && !isGameOver) {

            while (true) {
                try {
                    int posicaoJogador = jogador.realizarJogada();
                    boolean condicaoJogador = tabuleiro.verificarPosicao(posicaoJogador);

                    if (condicaoJogador) {
                        tabuleiro.marcarPosicao(posicaoJogador, jogador.PECA_JOGADOR);
                        jogador.adicionarPosicao(posicaoJogador);
                        isWinner = tabuleiro.condicaoDeVitoria(jogador.getJogadorPosicoes());

                        if (isWinner) {
                            tabuleiro.mostrarTabuleiro();
                            System.out.println("\nPARABENS! VOCÊ VENCEU!");
                            break;
                        } else if (jogador.getJogadorPosicoes().size() + computador.getComputadorPosicoes().size() == 9) {
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
                if (isWinner || isGameOver) {
                    break;
                }

                int posicaoComputador = computador.realizarJogada();
                boolean condicaoComputador = tabuleiro.verificarPosicao(posicaoComputador);

                if (condicaoComputador) {
                    tabuleiro.marcarPosicao(posicaoComputador, computador.PECA_COMPUTADOR);
                    computador.adicionarPosicao(posicaoComputador);
                    isWinner = tabuleiro.condicaoDeVitoria(computador.getComputadorPosicoes());

                    if (isWinner) {
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
