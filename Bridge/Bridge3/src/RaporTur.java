public class RaporTur {
    protected IRaporFormat raporFormat;

    public IRaporFormat getRaporFormat() {
        return raporFormat;
    }

    public void setRaporFormat(IRaporFormat raporFormat) {
        this.raporFormat = raporFormat;
    }

    public RaporTur(){}
    public RaporTur(IRaporFormat _raporFormat)
    {
        raporFormat = _raporFormat;
    }

    public void goster() {
        System.out.println("Gosterildi" );
        this.raporFormat.olustur();
    }
}
