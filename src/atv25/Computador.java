package atv25;

public class Computador {
    public String marca;
    public String memoria;
    public String processador;
    public String discoRigido;

    @Override
    public String toString() {
        return "discoRigido: " + discoRigido + ", marca: " + marca + ", memoria:" + memoria + ", processador: "
                + processador;
    }

    
    
}
