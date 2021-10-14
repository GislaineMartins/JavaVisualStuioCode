package atv23.controller;

import java.util.ArrayList;

import atv23.model.Livro;

/**
 * LivroController
 */
public class LivroController {

    private ArrayList<Livro> livros;

    

    public LivroController() {
        this.livros = new ArrayList<Livro>();
    }

    public void salvar(Livro livro){
        livros.add(livro);
    }

    public ArrayList<Livro> listar(){
        return livros;
    }

    public void deletar(Livro livro){
        livros.remove(livro);
    }

    public void alterar(Livro livro){
        //int tamanho = this.livros.size();

        for (int i=0; i < livros.size(); i++) {
            Livro liv = this.livros.get(i);
            if(liv.getId() == livro.getId()){
                deletar(livro);
                salvar(livro);
            }
            
        }
    }

    
}