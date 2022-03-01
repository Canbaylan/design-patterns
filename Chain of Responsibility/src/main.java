public class main {
    public static void main(String[] args) {
        //zinciri olusturacak halkalar tanımlanıyor
        PlayerHandler mp4Player = new concMp4();
        PlayerHandler aviPlayer = new concAvi();
        PlayerHandler mpgPlayer = new concMpg();

        //halkalar sıralanıyor
        mp4Player.sonrakiHandle(mpgPlayer);
        mpgPlayer.sonrakiHandle(aviPlayer);

        //istekler zincirin ilk halkasına gonderiliyor
        mp4Player.play("video.mpg");
        mp4Player.play("video.avi");
        mp4Player.play("video.mp4");

    }
}
