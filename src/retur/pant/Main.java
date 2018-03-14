package retur.pant;

public class Main {
    public static void main(String[] args) {
        FlaskeVærdi flaske1 = new FlaskeVærdi(Type.PANT_A, 1);

        System.out.println("Der er kommet 1 " + flaske1.type + " ind." + flaske1.værdi + " tilføjet til total udbetaling.");
    }

}
