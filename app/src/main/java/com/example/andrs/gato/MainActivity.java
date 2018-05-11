package com.example.andrs.gato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
public Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
public Butt bo1, bo2, bo3, bo4, bo5, bo6, bo7, bo8, bo9;
public int player;

    void draw1(int XO){
        if(XO==1)
            b1.setBackgroundColor(0xFF303F9F);
        else
            b1.setBackgroundColor(0xFFD42620);
    }
    void draw2(int XO){
        if(XO==1)
            b2.setBackgroundColor(0xFF303F9F);
        else
            b2.setBackgroundColor(0xFFD42620);
    }
    void draw3(int XO){
        if(XO==1)
            b3.setBackgroundColor(0xFF303F9F);
        else
            b3.setBackgroundColor(0xFFD42620);
    }
    void draw4(int XO){
        if(XO==1)
            b4.setBackgroundColor(0xFF303F9F);
        else
            b4.setBackgroundColor(0xFFD42620);
    }
    void draw5(int XO){
        if(XO==1)
            b5.setBackgroundColor(0xFF303F9F);
        else
            b5.setBackgroundColor(0xFFD42620);
    }
    void draw6(int XO){
        if(XO==1)
            b6.setBackgroundColor(0xFF303F9F);
        else
            b6.setBackgroundColor(0xFFD42620);
    }
    void draw7(int XO){
        if(XO==1)
            b7.setBackgroundColor(0xFF303F9F);
        else
            b7.setBackgroundColor(0xFFD42620);
    }
    void draw8(int XO){
        if(XO==1)
            b8.setBackgroundColor(0xFF303F9F);
        else
            b8.setBackgroundColor(0xFFD42620);
    }
    void draw9(int XO){
        if(XO==1)
            b9.setBackgroundColor(0xFF303F9F);
        else
            b9.setBackgroundColor(0xFFD42620);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player=0;
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        bo1 = new Butt();
        bo2 = new Butt();
        bo3 = new Butt();
        bo4 = new Butt();
        bo5 = new Butt();
        bo6 = new Butt();
        bo7 = new Butt();
        bo8 = new Butt();
        bo9 = new Butt();

        b1.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if(bo1.block==false){
                            player = bo1.change(player);
                            draw1(bo1.XO);

                        }
                    }
                }
        );
        b2.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if(bo2.block==false){
                            player = bo2.change(player);
                            draw2(bo2.XO);
                        }
                    }
                }
        );
        b3.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if(bo3.block==false){
                            player = bo3.change(player);
                            draw3(bo3.XO);
                        }

                    }
                }
        );
        b4.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if(bo4.block==false){
                            player = bo4.change(player);
                            draw4(bo4.XO);
                        }

                    }
                }
        );
        b5.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if(bo5.block==false){
                            player = bo5.change(player);
                            draw5(bo5.XO);
                        }

                    }
                }
        );
        b6.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if(bo6.block==false){
                            player = bo6.change(player);
                            draw6(bo6.XO);
                        }

                    }
                }
        );
        b7.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if(bo7.block==false){
                            player = bo7.change(player);
                            draw7(bo7.XO);
                        }

                    }
                }
        );
        b8.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if(bo8.block==false){
                            player = bo8.change(player);
                            draw8(bo8.XO);
                        }

                    }
                }
        );
        b9.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if(bo9.block==false){
                            player = bo9.change(player);
                            draw9(bo9.XO);
                        }

                    }
                }
        );

    }

}
