public class Marka {
    private String marka;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Marka(String marka) {
        setMarka(marka);
    }

    @Override
    public String toString() {
        return "Marka {" +
                "marka='" + marka + '\'' +
                '}';
    }
}
