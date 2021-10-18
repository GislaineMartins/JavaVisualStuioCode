package atv25;

public class Notebook extends Computador{
    public String bateria;
    public String velocidadeWifi;
    public String bluetooth;

    @Override
    public String toString() {        
        return "bateria: " + bateria + ", bluetooth: " + bluetooth + ", velocidadeWifi: " + velocidadeWifi 
        + super.toString();
    }

    


    
}
