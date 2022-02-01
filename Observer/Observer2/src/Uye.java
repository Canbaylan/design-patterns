public class Uye implements IUye{
    public Uye(String email)
    {
        setEmail(email);
    }
    public String email;
    @Override
    public void Update(absUrun urun) {
        System.out.println(urun.urunAdi + " urununun fiyati dustu -> "+getEmail());
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }}