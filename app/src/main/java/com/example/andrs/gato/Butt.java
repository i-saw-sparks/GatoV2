package com.example.andrs.gato;

/**
 * Created by Andrés on 10/05/2018.
 */

public class Butt {
    boolean block;
    int XO;
    public Butt(){
    }

    public int change(int play){
        if(play==0) {
            XO = 1;
            play=1;
        }
        else {
            XO = 2;
            play=0;
        }
        block=true;
        return play;
    }


    public Butt(boolean block, int XO){
        this.block = false;
        this.XO = 0;
    }
}
