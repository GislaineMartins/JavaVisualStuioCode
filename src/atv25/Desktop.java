package atv25;

public class Desktop extends Computador{

    public String tamanhoGabinete;
    public String monitorExterno;
    public String fonte;

    @Override
    public String toString() {        
        return "fonte: " + fonte + ", monitorExterno: " + monitorExterno + ", tamanhoGabinete: " + tamanhoGabinete
                + super.toString();
    }

    
    
}
