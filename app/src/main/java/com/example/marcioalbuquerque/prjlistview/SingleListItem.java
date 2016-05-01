package com.example.marcioalbuquerque.prjlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SingleListItem extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.setContentView(R.layout.single_list_item_view);
        TextView txtPais = (TextView) findViewById(R.id.pais_label);
        Intent i = getIntent();
        String pais = i.getStringExtra("pais");
        // Mostrar o nome do país selecionado
        txtPais.setText(pais);

    }
}

