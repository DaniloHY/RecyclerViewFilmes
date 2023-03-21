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
        listaFilmes.add(
                new Filmes("A queda",
                        "Para os melhores amigos Becky e Hunter, a vida é sobre vencer medos e ultrapassar limites. " +
                                "Mas depois de subirem 2.000 pés até o topo de uma torre de rádio abandonada e remota, eles se veem presos sem saída.",
                        "Suspense",
                        R.drawable.queda));
        listaFilmes.add(
                new Filmes("Duro de Atuar",
                                "Kevin Hart - interpretando uma versão de si mesmo - está em uma missão que desafia a morte para se tornar uma estrela de ação. " +
                                "E com uma pequena ajuda de John Travolta, Nathalie Emmanuel e Josh Hartnett - ele pode conseguir.",
                        "Comédia/Ação",
                        R.drawable.duro));
        listaFilmes.add(
                new Filmes("Sayen",
                        "Nas florestas do sul do Chile, uma jovem mapuche, Sayen, sai em busca dos mercenários que assassinaram sua avó. Utilizando seu treinamento, ela é capaz de sobreviver e virar o jogo contra esses intrusos. " +
                                "Ela deve escolher entre ir embora ou proteger não apenas o seu, mas também outros grupos indígenas da sinistra corporação que ameaça seus",
                        "Suspense",
                        R.drawable.sayen));
        listaFilmes.add(
                new Filmes("Coringa",
                        "\n" +
                                "\"Coringa\" gira em torno do icônico arqui-inimigo e é uma história original e independente nunca antes vista na tela grande. " +
                                "A exploração de Arthur Fleck (Joaquin Phoenix), um homem desconsiderado pela sociedade, não é apenas um estudo de personagem corajoso, mas também um conto de advertência mais amplo.",
                        "Drama/Suspense",
                        R.drawable.coringa));
        listaFilmes.add(
                new Filmes("Triângulo da Tristeza",
                        "O casal modelo de celebridades, Carl e Yaya, são convidados para um cruzeiro de luxo para os super-ricos. " +
                                "O que parecia digno de ser fotografado para as redes sociais termina catastroficamente, quando uma tempestade brutal atinge o navio deixando os sobreviventes presos em uma ilha deserta e lutando pela sobrevivência.",
                        "Comédia/Drama",
                        R.drawable.triangulo));
        listaFilmes.add(
                new Filmes("Jogo de Amor e Ódio",
                        "\n" +
                                "Decidida a alcançar o sucesso profissional sem comprometer sua ética, Lucy embarca em um jogo implacável de superioridade contra o frio e eficiente inimigo Joshua, uma rivalidade que é complicada por sua crescente atração por ele.",
                        "Comédia/Romance",
                        R.drawable.odio));
        listaFilmes.add(
                new Filmes("Triângulo da Tristeza",
                        "O casal modelo de celebridades, Carl e Yaya, são convidados para um cruzeiro de luxo para os super-ricos. " +
                                "O que parecia digno de ser fotografado para as redes sociais termina catastroficamente, quando uma tempestade brutal atinge o navio deixando os sobreviventes presos em uma ilha deserta e lutando pela sobrevivência.",
                        "Comédia/Drama",
                        R.drawable.triangulo));
        listaFilmes.add(
                new Filmes("Triângulo da Tristeza",
                        "O casal modelo de celebridades, Carl e Yaya, são convidados para um cruzeiro de luxo para os super-ricos. " +
                                "O que parecia digno de ser fotografado para as redes sociais termina catastroficamente, quando uma tempestade brutal atinge o navio deixando os sobreviventes presos em uma ilha deserta e lutando pela sobrevivência.",
                        "Comédia/Drama",
                        R.drawable.triangulo));
        listaFilmes.add(
                new Filmes("Triângulo da Tristeza",
                        "O casal modelo de celebridades, Carl e Yaya, são convidados para um cruzeiro de luxo para os super-ricos. " +
                                "O que parecia digno de ser fotografado para as redes sociais termina catastroficamente, quando uma tempestade brutal atinge o navio deixando os sobreviventes presos em uma ilha deserta e lutando pela sobrevivência.",
                        "Comédia/Drama",
                        R.drawable.triangulo));

        //criando a classe adaptadora e passando os parâmetros
        MyAdapter adapter = new MyAdapter(getApplicationContext(), listaFilmes);

        //Tipo de layout que a lista irá seguir

        idRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        //fixador de tamanho da lista - deixar mais rápida
        idRecyclerView.setHasFixedSize(true);

        //ligar o recyclerview ao adaptador
        idRecyclerView.setAdapter(adapter);
    }
}