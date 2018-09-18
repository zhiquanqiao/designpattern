/**
 * Created by qiaozhiquan on 2018/3/14.
 */
public class ErrorLogger extends AbstractLogger {
    @Override
    protected void write(String message) {
        System.out.println("Error Console:: Logger" + message);
    }

    public ErrorLogger(int level){
        this.level = level;
    }


}
