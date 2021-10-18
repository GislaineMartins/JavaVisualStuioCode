package atv25;

public class Main {
    public static void main(String[] args) {
        Computador comp = new Computador();
        comp.discoRigido = "SATA";
        comp.marca = "Sansung";
        comp.memoria = "32gb";
        comp.processador = "Intel Core i5";

        Notebook not = new Notebook();
        not.bateria = "10 horas";
        not.bluetooth = "ssss";
        not.discoRigido = "SATA";
        not.marca = "Sansung";
        not.memoria = "8gb";
        not.processador = "Intel Core i5";
        not.velocidadeWifi = "rapido";

        Desktop desk = new Desktop();
        desk.discoRigido = "SATA";
        desk.fonte = "NP900X3C";
        desk.marca = "Sansung2";
        comp.memoria = "8gb";
        desk.monitorExterno = "Monito LED 24";
        desk.processador = "i5";
        desk.tamanhoGabinete = "‎51.05 x 22 x 47.5 cm";

        Object obj1 = comp;
        Object obj2 = not;
        Object obj3 = desk;

        Computador novoComp = (Computador)obj1;
        Notebook novoNot = (Notebook)obj2;
        Desktop novoDesktop = (Desktop)obj3;

        System.out.println(novoComp);
        System.out.println(novoNot);
        System.out.println(novoDesktop);





    }
    
}
