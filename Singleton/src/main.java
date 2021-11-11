
public class main  {

    public static void main(String[] args) {
        Singleton nesne1 = Singleton.getSingleton();
        Singleton nesne2 = Singleton.getSingleton();
        Singleton nesne3 = Singleton.getSingleton();

        if(nesne1 == nesne2 && nesne2 == nesne3) System.out.println("Nesneler ayni");
        else System.out.println("Nesneler aynı degil.");
    }


}
