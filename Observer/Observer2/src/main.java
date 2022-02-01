public class main {
    public static void main(String[] args) {
        absUrun kitap = new Urun("Lord of the Rings",15);
        Uye canb =new Uye("canbaylan34@gmail.com");
        Uye gulb = new Uye("gulay24@hotmail.com");
        kitap.takipList.add(canb);
        kitap.takipList.add(gulb);
        kitap.setFiyat(13);

    }



}
