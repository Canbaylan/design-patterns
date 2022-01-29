import java.util.Scanner;

public class Adaptee {
    public double VadeliTutarHesapla(int miktar, double oran)
    {
        System.out.println("Yatirilan tutari girin: " + miktar);
        return miktar + (miktar * oran/100);
    }
}
