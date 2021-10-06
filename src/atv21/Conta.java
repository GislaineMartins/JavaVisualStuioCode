package atv21;

public class Conta {

    private double saldo;
    private int CodCliente;

    public void setCodCliente(int codCliente) {
        CodCliente = codCliente;
    }

    public int getCodCliente() {
        return CodCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void transferencia(double valor){
        this.saldo = this.saldo - valor;     

    }


    
}
