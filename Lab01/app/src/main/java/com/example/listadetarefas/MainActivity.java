package com.example.listadetarefas;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText entrada;
    private ArrayList<String> Entradas = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entrada = findViewById(R.id.editTextTarefa);
    }

    public void addTarefa(View v) {
        Entradas.add(entrada.getText().toString());
        entrada.setText("");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Entradas);
        ListView listView = findViewById(R.id.listTarefa);
        listView.setAdapter(adapter);

    }
}