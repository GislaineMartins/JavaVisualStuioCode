package atv24;

public class Main {

    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();
        veiculo.marca = "Fiat";
        veiculo.modelo = "Fiat Uno";
        veiculo.placa = "QRT1234";

        Carro carro = new Carro();
        carro.numPortas = 4;
        carro.capciPortaMalas = 1000.00;

        Object obj1 = veiculo;
        Object obj2 = carro;

        Veiculo obj1Novo = (Veiculo)obj1;

        Carro obj2Novo = (Carro)obj2;

        System.out.println(obj1Novo);
        System.out.println(obj2Novo);


    }
    
}
