package com.example.listing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class EscolherFotoActivity extends AppCompatActivity {

    private ImageView imagemTela1, imagemTela2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolher_foto);

        imagemTela1 = findViewById(R.id.fotoRetrato);
        imagemTela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mandarImagem1ParaTelaCadastro();
            }
        });

        imagemTela2 = findViewById(R.id.fotoRostos);
    }

    private void mandarImagem1ParaTelaCadastro() {
        Intent intent = new Intent(EscolherFotoActivity.this, CadastroActivity.class);
        startActivity(intent);
    }
}