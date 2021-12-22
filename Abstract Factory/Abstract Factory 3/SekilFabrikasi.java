public class SekilFabrikasi extends SoyutFabrika{
    @Override
    Renk rengiGetir(String renk) {
        throw new UnsupportedOperationException();
    }

    @Override
    Sekil sekliGetir(String sekil) {
        if(sekil == null)
        {
            return null;
        }
        else if(sekil == "daire")
        {
            return new Daire();
        }
        else if(sekil == "kare")
        {
            return new Kare();
        }
        return null;
    }
}
