package com.example.marcioalbuquerque.prjlistview;

import android.annotation.SuppressLint;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.suitebuilder.annotation.Suppress;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

@SuppressLint("ParserError")
public class ListViewActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        //Copiar strings para Array
        String[] listaPaises = getResources().getStringArray(R.array.paises);

        //Fazer uma ligação do Array(listaPaises) para um ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.label, listaPaises));

        ListView lv = getListView();

        //Lidar com o clique de um item da lista
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //Item selecionado
            String pais = ((TextView)view).getText().toString();
            Long.d("DEBUG", pais);
            //Invocar nova atividade após seleção de item
            Intent intent = new Intent(getApplicationContext(), SingleListItem.class);
            //Enviar dados para a nova atividade
            intent.putExtra("pais", pais);
            startActivity(intent);
            }
        });
        }
    }

