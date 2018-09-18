/**
 * Created by qiaozhiquan on 2018/3/14.
 */
public class IteratorPatternDemo {

    public static void main(String [] args){
        NameResponsitory nameResponsitory = new NameResponsitory();

        for(Iterator iterator = nameResponsitory.getIterator();iterator.hasNext();){
            System.out.println("Name : " + String.valueOf(iterator.next()));
        }

    }

}
