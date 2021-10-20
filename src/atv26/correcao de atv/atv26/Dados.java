package atv26;

public class Dados {

    private Object[] dados;
    private int posicao;

    public Dados() {
        this.dados = new Object[5];
    }

    public int tamanho() {
        return posicao;
    }

    // Primeiro jeito de usar o add. Insere o objeto sem verificar se o array esta
    // cheio
    public void add(Object obj) {
        // Só adiciona se tiver tamanho no vetor. Ou seja,
        // se a posição for menor do que o tamnho total do Array
        if (posicao < this.dados.length) {
            this.dados[posicao] = obj;
            posicao++;
        } else {
            int novoTammanho = this.dados.length + 5;
            Object[] dados2 = new Object[novoTammanho];
            for (int i = 0; i < dados.length; i++) {
                dados2[i] = dados[i];
            }
            // Cópia dos dados. O dado antigo recebe o novo array de mais posições
            dados = dados2;
            this.dados[posicao] = obj;
            posicao++;
        }
    }

    // Segundo jeito de usar o add. Verifica primeiro se será necessario aumentar o
    // array
    public void add2(Object obj) {
        if (posicao >= this.dados.length) {
            int novoTammanho = this.dados.length + 5;
            Object[] dados2 = new Object[novoTammanho];
            for (int i = 0; i < dados.length; i++) {
                dados2[i] = dados[i];
            }
            dados = dados2;
        }
        this.dados[posicao] = obj;
        posicao++;
    }

    // Terceiro jeito de usar o add utilizando metodo
    public void add3(Object obj) {
        verificaTamanhoArray();
        this.dados[posicao] = obj;
        posicao++;
    }

    private void verificaTamanhoArray() {
        if (posicao >= this.dados.length) {
            int novoTammanho = this.dados.length + 5;
            Object[] dados2 = new Object[novoTammanho];

            for (int i = 0; i < dados.length; i++) {
                dados2[i] = dados[i];
            }
            dados = dados2;
        }
    }

    public void remove(Object obj) {
        // for para percorrer a lista para achar o objeto
        for (int i = 0; i < dados.length; i++) {
            // compara o objeto recebido chamando o metodo equals
            if (obj.equals(dados[i])) {
                reorganizaArray(i);
            }
        }
        this.dados[0] = null;
    }
 

    // remove utilizando o metodo busca
    public void remove2(Object obj) {
        int indice = busca(obj);
        if(indice >= 0){
            reorganizaArray(indice);

        }
    }

    public boolean existe(Object obj) {
        for (int i = 0; i < dados.length; i++) {
            // compara o objeto recebido chamando o metodo equals
            if (obj.equals(dados[i])) {
                return true;
            }
        }
        return false;
    }

    private int busca(Object obj) {
        for (int i = 0; i < dados.length; i++) {
            if (obj.equals(dados[i])) {
                return i;
            }
        }
        return -1;

    }

    private void reorganizaArray(int pos) {
        for (int i = pos; i < posicao; i++) {
            dados[i] = dados[i + 1];
        }
        posicao--;

    }

}
