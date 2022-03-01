public class concMpg extends PlayerHandler{
        @Override
        public void play(String filePath) {
            if(filePath.endsWith(".mpg"))
                System.out.println(filePath + " dosyasi Mpg player'da oynatiliyor.");
            else
            {
                if(_sonrakiHandler!=null)
                    _sonrakiHandler.play(filePath);
            }
        }
    }


