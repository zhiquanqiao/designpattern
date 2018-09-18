/**
 * Created by qiaozhiquan on 2018/3/12.
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equals("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equals("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String filename) {

        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(filename);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.palyMp4(filename);
        }
    }
}
