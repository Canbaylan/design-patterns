public class FabrikaYaratici {
    public static SoyutFabrika getFabrika(String secim)
    {
        if(secim == "sekil")
        {
            return new SekilFabrikasi();
        }
        else if(secim == "renk")
        {
            return new RenkFabrikasi();
        }
        return null;
    }
}
