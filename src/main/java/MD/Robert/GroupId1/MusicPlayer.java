package MD.Robert.GroupId1;

public class MusicPlayer {
    private Music music; //am implementat interfata Musica, deci putem asculta orice muzica

    //IoC - Inversion of Control
    public MusicPlayer(Music music){
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: "+ music.getSong());
    }
}
