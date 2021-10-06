package atv21;

public class ContaCorrente extends Conta {
    private double taxaTransferecia = 10.50;
    private double taxaManutencao = 2.50;
    private int numTranferencia = 0;

    @Override
    public void transferencia(double valor){
        super.transferencia(valor);
        double saldo = (this.getSaldo()) - taxaTransferecia; 
        this.setSaldo(saldo); 
        
        numTranferencia++;
        if(this.numTranferencia % 5 == 0){
            saldo = (this.getSaldo()) - taxaManutencao; 
            this.setSaldo(saldo);  
        }  

    }

    






    
}
