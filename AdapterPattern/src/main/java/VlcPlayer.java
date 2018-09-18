/**
 * Created by qiaozhiquan on 2018/3/12.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {
        System.out.println("Playing vlc file name:" + filename);
    }

    @Override
    public void palyMp4(String filename) {
        //什么也不做
    }
}
