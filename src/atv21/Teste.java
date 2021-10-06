package atv21;

public class Teste {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.setSaldo(900.00);
        c.setCodCliente(1);
        c.transferencia(100);

        ContaCorrente cc = new ContaCorrente();
        cc.setCodCliente(2);
        cc.setSaldo(1000.00);
        cc.transferencia(100);
        cc.transferencia(100);
        cc.transferencia(100);
        cc.transferencia(100);
        cc.transferencia(100);
        cc.transferencia(100);        

    

        System.out.println("----------------SALDO DEPOIS DA TRANSFERENCIA----------------");
        System.out.println("tranf: "+c.getSaldo());
        System.out.println("tranf: "+cc.getSaldo());

   
    }
    
}
