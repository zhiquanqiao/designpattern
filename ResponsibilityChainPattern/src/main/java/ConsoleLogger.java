/**
 * Created by qiaozhiquan on 2018/3/14.
 */
public class ConsoleLogger extends AbstractLogger {


    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger" +message);
    }

    public ConsoleLogger(int level){
        this.level = level;
    }
}
