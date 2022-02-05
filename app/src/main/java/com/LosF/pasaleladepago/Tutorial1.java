package com.LosF.pasaleladepago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Tutorial1 extends AppCompatActivity {
    ImageButton siguiente;
    Button omitir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial1);

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
    }

    private void Siguiente(){
        startActivity(new Intent(Tutorial1.this,tutorial2.class));
    }

    private void Omitir(){
        startActivity(new Intent(Tutorial1.this,Menu.class));
    }

}