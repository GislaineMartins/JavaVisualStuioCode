package atv22.conta;

public class TelaBanco {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(500, 111);
        cc.saque(100);
        cc.deposito(100);
        System.out.println(cc);



    }
    
}
