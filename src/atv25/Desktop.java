package atv25;

public class Desktop extends Computador{

    public String tamanhoGabinete;
    public String monitorExterno;
    public String fonte;
    
    @Override
    public String toString() {
        return "Desktop [fonte=" + fonte + ", monitorExterno=" + monitorExterno + ", tamanhoGabinete=" + tamanhoGabinete
                + "]";
    }

    
    
}
