package atv26.ArrayList.model;
/**
 * Pessoa
 */
public class Pessoa {

    public String nome;
    public String sobrenome;
    public byte idade;

   @Override
   public boolean equals(Object obj) { 
       // instanceof: verifica se o objeto passado por parametro é do tipo pessoa.
       // Por exemplo podemos passar uma String como paramentro. Logo, String nao é uma pessoa.
       // Sendo assim, nao entrará no primeiro if.
       if(obj instanceof Pessoa){ 
           Pessoa outra = (Pessoa)obj;
           if(this.idade == outra.idade){
               return true;
           }
       }

       return false;
   }

   @Override
   public String toString() {
       String retorno = this.nome + this.sobrenome + this.idade;
       return retorno;
       
   }
    
}