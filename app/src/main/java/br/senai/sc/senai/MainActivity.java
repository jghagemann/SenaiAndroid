package br.senai.sc.senai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtnMostrar(View v) {
        EditText editTextTexto = findViewById(R.id.et_texto);
        EditText editTextTexto2 = findViewById(R.id.et_texto2);

        String campo1 = editTextTexto.getText().toString();
        String campo2 = editTextTexto2.getText().toString();
        String completo = campo1 + " " + campo2;

        Toast.makeText(MainActivity.this, completo, Toast.LENGTH_LONG).show();
    }

    public void onClickBtnApagar(View v) {
        EditText editTextTexto = findViewById(R.id.et_texto);
        EditText editTextTexto2 = findViewById(R.id.et_texto2);

        editTextTexto.getText().clear();
        editTextTexto2.getText().clear();
    }
}