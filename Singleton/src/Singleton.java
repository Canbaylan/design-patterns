public class Singleton {

    // Static bir metodun içerisinden static olmayan
    // metotlar veya değişkenler çağrılamaz. Metod static olduğundan
    // oluşturduğumuz nesneye static keyword'unu ekleriz.

    private static Singleton singleton;

    private Singleton()
    {
        // Yapıcı metodu private yaparak nesneyi dışarıya kapattık.
        /// Bundan sonra başka sınıflar bu sınıfı new'leyemez.
        /// New'leyememesini demek nesne oluşturamaması demek.
        /// Sınıfımızın içinde nesneyi tanımlayıp metodla dışarıya açacağız.

        System.out.println("Nesne olusturuldu.");

    }

    // Bir nesneyi new'lemeden(Yapıcı metod private olduğundan) o nesneyi
    // kullanmak için static tanımlaması yapıyoruz.

    public static Singleton getSingleton()
    {
        // Multithread ortamlarda aynı anda 2 çağrı yapılırsa
        // kontrollerimizde 2'side null olacak ve 2 nesne oluşturulacak.
        // synchronized anahtar sözcüğü ile thread safe'i sağlamış oluyoruz.
        // Singleton.class tanımlaması, belirttiğimiz sınıf adını
        // temsil eden sınıf nesnesi döndürür.
        // Thread'ler "synchronized" anahtar kelimesini gördükten sonra
        // birbirlerini beklerler. Dolayısıyla kodumuzun olabildiğince az
        // "synchronized" ile karşılaşması gerekir. Bunun için bir kontrol
        // daha yapıyoruz.(Double Checked Loading)

        if(singleton == null)
        {
            synchronized (Singleton.class)
            {
                if(singleton == null)
                {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
