import java.util.Scanner;

public class Client {
    public void FaizHesapla(ITutarHesaplayici hesapla)
    {
        System.out.println("Yatirilacak tutari girin: ");
        Scanner giris = new Scanner(System.in);
        int miktar = giris.nextInt();
        System.out.println("Faiz orani girin: ");
        double oran = giris.nextDouble();
        System.out.println("Toplam tutariniz: "+hesapla.Hesapla(miktar,oran));


    }
}
