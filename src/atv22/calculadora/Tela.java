package atv22.calculadora;

public class Tela {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        int cal1 = cal.soma(1, 1);
        double cal2= cal.soma(100.0, 100.0);
        float cal3 = cal.soma(10.1f, 10.1f, 10.1f);
        long cal4 = cal.soma(10L, 20L, 30L);

        System.out.println(cal1);
        System.out.println(cal2);
        System.out.println(cal3);
        System.out.println(cal4);
    }
    
}
