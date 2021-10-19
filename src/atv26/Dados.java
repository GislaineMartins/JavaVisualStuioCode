package atv26;


public class Dados {

    Object[] lista;
    private int tamanho =5;
    private int contador=0;

    public Dados() {
        lista = new Object[tamanho];
    }

    public String adicionar(Object obj){
        String msg;
        lista[contador] = obj;
        contador++;
        msg ="Adicionado com sucesso";        
        
        if(contador > lista.length){
            Object[] lista2 = new Object[lista.length * 2];
            lista = lista2;
        }
        return msg;

    }

    public int posicao(){
        return contador;
    }

    public String remover(Object obj){
        String msg;
        for(int i=0; i<lista.length;i++){
            if(lista[i].equals(obj)){
                contador--;
                msg = "Removido com sucesso!!";
                return msg;
            }
        }
        msg = "Não encontrado";
        return msg;
    }


    

    

    
    
}
