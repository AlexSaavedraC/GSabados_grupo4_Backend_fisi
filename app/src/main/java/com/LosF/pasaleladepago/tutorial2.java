package com.LosF.pasaleladepago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class tutorial2 extends AppCompatActivity {
    ImageButton siguiente, atras;
    Button omitir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial2);

        siguiente = findViewById(R.id.imageButton2);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Siguiente();
            }
        });

        omitir = findViewById(R.id.btnOmitir);
        omitir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Omitir();
            }
        });

        atras = findViewById(R.id.imageButton);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Atras();
            }
        });
    }

    private void Atras(){
        startActivity(new Intent(tutorial2.this,Tutorial1.class));
    }

    private void Siguiente(){
        startActivity(new Intent(tutorial2.this,Tutorial3.class));
    }

    private void Omitir(){
        startActivity(new Intent(tutorial2.this,Menu.class));
    }
}