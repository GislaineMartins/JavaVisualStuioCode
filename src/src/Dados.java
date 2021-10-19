public class Dados {

    int posicao = 0;
    private Object[] dados;

    public Dados(){
        this.dados = new Object[5];
    }

    public String adiciona(Object obj){
        if(posicao < dados.length){
            dados[posicao] = obj;
            posicao++;
            return "Adicionado";
        }
        else{
            Object[] dados2 = new Object[dados.length *2];
            dados = dados2;
            return "Adicionado";
        }
    }


    public  String remover(Object obj){
        for(int i=0; i< dados.length;i++){
            if(dados[i].equals(obj)){
                posicao--;
                return "Item removido";
            }
        }
        return "Não encontrado";
    }

    public String verificar(Object obj){
        for(int i=0; i< dados.length;i++){
            if(dados[i].equals(obj)){
                return  "Objeto existente";
            }
        }
        return  "Objeto nao cadastrado";

    }
}
