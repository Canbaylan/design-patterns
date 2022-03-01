public class concAvi extends PlayerHandler{
    @Override
    public void play(String filePath) {
        if(filePath.endsWith(".avi"))
            System.out.println(filePath + " dosyasi avi player'da oynatiliyor.");
        else
        {
            if(_sonrakiHandler!=null)
                _sonrakiHandler.play(filePath);
        }
    }
}
