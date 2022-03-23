package com.uninter.model.entities;

import java.util.Random;

public class ComputadorA extends Computador {

    public int realizarJogada(){
        Random r = new Random();
        return r.nextInt(9) + 1;
    }
}
