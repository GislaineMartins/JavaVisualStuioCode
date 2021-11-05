
import java.util.ArrayList;

import atv26.ArrayList.model.Aluno;

public class AlunoController {

    private ArrayList<Aluno> dados;
 

    public AlunoController() {
        this.dados = new ArrayList<Aluno>();
    }

    public int numeroItens() {
        return dados.size();
    }

    public ArrayList<Aluno> read(){
        return this.dados;
    }

    public void update(Aluno obj){

        if(existe(obj)){
            this.delete(obj);
            this.create(obj);
        }

    }
   
    public void create(Aluno obj) {
        this.dados.add(obj);
    }

    public void delete(Aluno obj) {
        this.dados.remove(obj);
    }

    public boolean existe(Aluno obj){
       return  this.dados.contains(obj);

    }

    
}
