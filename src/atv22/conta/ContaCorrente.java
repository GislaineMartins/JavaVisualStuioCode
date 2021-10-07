package atv22.conta;

public class ContaCorrente {

    private double saldo;
    private double taxaSaque = 2.5;
    private int codCliente;
    
    public ContaCorrente(double saldo, int codCliente){
        this.saldo = saldo;
        this.codCliente = codCliente;
    }

    public void saque(double valor){
        this.saldo = this.saldo - valor - taxaSaque;

    }

    public void deposito(double valor){
        this.saldo = this.saldo + valor;
    }

    @Override
    public String toString( ) {
        String mensagem = "Saldo: "+ this.saldo 
        + "\nTaxa saque: " + this.taxaSaque 
        + "\nCodigo do cliente: " + this.codCliente
        + "\n ------------------";
        return mensagem;
    }



    
}
