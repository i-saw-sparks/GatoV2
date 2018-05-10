package com.example.andrs.gato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
public Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
public Butt bo1, bo2, bo3, bo4, bo5, bo6, bo7, bo8, bo9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

                    }
                }
        );
        b2.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){

                    }
                }
        );
        b3.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){

                    }
                }
        );
        b4.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){

                    }
                }
        );
        b5.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){

                    }
                }
        );
        b6.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){

                    }
                }
        );
        b7.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){

                    }
                }
        );
        b8.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){

                    }
                }
        );
        b9.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){

                    }
                }
        );

    }

}
