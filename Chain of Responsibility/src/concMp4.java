public class concMp4 extends PlayerHandler{
    @Override
    public void play(String filePath) {
        if(filePath.endsWith(".mp4"))
            System.out.println(filePath + " dosyasi mp4 player'da oynatiliyor.");
        else
        {
            if(_sonrakiHandler != null)
                _sonrakiHandler.play(filePath);
        }

    }
}