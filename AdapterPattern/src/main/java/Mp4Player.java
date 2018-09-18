/**
 * Created by qiaozhiquan on 2018/3/12.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {
        // do nothing
    }

    @Override
    public void palyMp4(String filename) {
        System.out.println("Playing mp4 file. Name" + filename);
    }
}
