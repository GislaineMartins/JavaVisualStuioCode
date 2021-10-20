package view;

import java.util.ArrayList;

import controller.FilmeControler;
import controller.SerieController;
import model.Filme;
import model.Serie;

public class Teste {
    public static void main(String[] args) {
        FilmeControler filmeC = new FilmeControler();
        SerieController serieC = new SerieController();

        Filme f = new Filme();
        Filme f2 = new Filme();        

        f.id = 1;
        f.titulo = "No limite do amanhã";
        f.categoria = "Ação/ficção cientifica";
        f.ano = 2014;

        f2.id = 2;
        f2.titulo = "Luta por justiça";
        f2.categoria = "Drama/Drama jurídico";
        f2.ano = 2019;

        Serie s = new Serie();
        Serie s1 = new Serie();
        Serie s2 = new Serie();
        Serie s3 = new Serie();

        s.id = 1;
        s.titulo = "Game of Thrones";
        s.categoria = "Drama";
        s.qtdTemporadas = 8;
        s.ano = 2011;

        s1.id = 2;
        s1.titulo = "The Walking Dead";
        s1.categoria = "Terror";
        s1.qtdTemporadas = 10;
        s1.ano = 2010;

        s2.id = 3;
        s2.titulo = "Round6"; // Para testar update trocar valor da String para "Round6" 
        s2.categoria = "Drama";
        s2.qtdTemporadas = 1; 
        s2.ano = 2021;

        
        filmeC.create(f);
        filmeC.create(f2);
        serieC.create(s);
        serieC.create(s1);
        serieC.create(s2);
        serieC.update(s2);

        System.out.println("Existe? "+filmeC.existe(f));
        System.out.println("Existe? "+filmeC.existe(f2));
        System.out.println("Existe? "+serieC.existe(s));
        System.out.println("Tamanho da lista de filmes: "+filmeC.numeroItens());
        System.out.println("Tamanho da lista de series: "+serieC.numeroItens());

        
        filmeC.delete(f);
        System.out.println("Existe? "+filmeC.existe(f));
        System.out.println();

        System.out.println("Lista de filmes");
        ArrayList<Filme> filmes = filmeC.read();
        for (Filme filme2 : filmes) {
            System.out.println(filme2);
        }
        System.out.println();

        System.out.println("Lista de series");
        ArrayList<Serie> series = serieC.read();
        for (Serie serie : series) {
            System.out.println(serie);
        }







    }
    
}
