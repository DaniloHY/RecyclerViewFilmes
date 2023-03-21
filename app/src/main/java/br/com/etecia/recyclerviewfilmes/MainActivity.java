package br.com.etecia.recyclerviewfilmes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Filmes> listaFilmes;

    //Declarar recyclerview
    RecyclerView idRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Apresentando o xml para o java
        idRecyclerView = findViewById(R.id.idListaFilmes);

        //criando a base de dados para carregamento da lista de filmes
        listaFilmes = new ArrayList<>();

        listaFilmes.add(
                new Filmes("Casamento Armado",
                        "Darcy (Jennifer Lopez) e Tom (Josh Duhamel) reúnem suas famílias para o casamento do destino final.",
                        "Comédia/Ação",
                        R.drawable.casamento));

        //criando a classe adaptadora e passando os parâmetros
        MyAdapter adapter = new MyAdapter(getApplicationContext(),listaFilmes);

        //Tipo de layout que a lista irá seguir

        idRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));

        //fixador de tamanho da lista - deixar mais rápida
        idRecyclerView.setHasFixedSize(true);

        //ligar o recyclerview ao adaptador
        idRecyclerView.setAdapter(adapter);
    }
}