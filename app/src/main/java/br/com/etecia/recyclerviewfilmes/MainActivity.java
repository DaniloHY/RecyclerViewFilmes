package br.com.etecia.recyclerviewfilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Filmes> listaFilmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //criando a base de dados para carregamento da lista de filmes
        listaFilmes = new ArrayList<>();

        listaFilmes.add(
                new Filmes("Casamento Armado",
                        "Darcy (Jennifer Lopez) e Tom (Josh Duhamel) reúnem suas famílias para o casamento do destino final.",
                        "Comédia/Ação",
                        R.drawable.casamento));

        //criando a classe adaptadora e passando os parâmetros
        MyAdapter adapter = new MyAdapter(getApplicationContext(),listaFilmes);
    }
}