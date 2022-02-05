package com.LosF.pasaleladepago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Tutorial3 extends AppCompatActivity {
    ImageButton atras;
    Button omitir, menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial3);

        menu = findViewById(R.id.btnMenu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Menu();
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
        startActivity(new Intent(Tutorial3.this,tutorial2.class));
    }

    private void Menu(){
        startActivity(new Intent(Tutorial3.this,Menu.class));
    }

    private void Omitir(){
        startActivity(new Intent(Tutorial3.this,Menu.class));
    }
}