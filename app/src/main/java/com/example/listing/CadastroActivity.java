package com.example.listing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class CadastroActivity extends AppCompatActivity {
    private Button button;
    private Button buttonVoltar;

    private EditText nome, sinopse, editora, ano;
    private Button botaoSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        nome = findViewById(R.id.nomeInput);
        sinopse = findViewById(R.id.sinopseInput);
        editora = findViewById(R.id.editoraInput);
        ano = findViewById(R.id.anoInput);
        botaoSalvar = findViewById(R.id.saveButton);

        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CadastroActivity.this, MainActivity.class);
                intent.putExtra("nome", nome.getText().toString());
                intent.putExtra("sinopse", sinopse.getText().toString());
                intent.putExtra("editora", editora.getText().toString());
                intent.putExtra("ano", ano.getText().toString());
                startActivity(intent);
            }
        });

        button = findViewById(R.id.botaoEscolherImg);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            openEscolherFoto();
            }
        });

        buttonVoltar = findViewById(R.id.button5);
        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltarParaLista();
            }
        });
    }

    private void openEscolherFoto() {
        Intent intent = new Intent(this, EscolherFotoActivity.class);
        startActivity(intent);
    }

    private void voltarParaLista() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}