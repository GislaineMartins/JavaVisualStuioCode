/**
 * Calculadora
 */
public class Calculadora {

    private int numUm;
    private int numDois;

    public int getNumUm() {
        return numUm;
    }
    public void setNumUm(int numUm) {
        this.numUm = numUm;
    }
    public int getNumDois() {
        return numDois;
    }
    public void setNumDois(int numDois) {
        this.numDois = numDois;
    }

    public int soma(){
        int soma = numUm + numDois;
        return soma;
    }

    public int subtracao(){
        int subtracao = numUm - numDois;
        return subtracao;
    }

    public int multiplicacao(){
        int multiplicacao = numUm * numDois;
        return multiplicacao;
    }

    public double divisao(){
        double divisao = numUm / numDois;
        return divisao;
    }



    
}