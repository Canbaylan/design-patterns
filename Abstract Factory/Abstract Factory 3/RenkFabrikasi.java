import com.sun.org.apache.xml.internal.security.keys.content.KeyInfoReference;

public class RenkFabrikasi extends SoyutFabrika {
    @Override
    Renk rengiGetir(String renk) {
        if(renk == null)
        {
            return null;
        }
        else if(renk == "lacivert")
        {
            return new Lacivert();
        }
        else if(renk == "sari")
        {
            return new Sarı();
        }
        return null;
    }

    @Override
    Sekil sekliGetir(String sekil) {
        throw new UnsupportedOperationException();
    }
}
