import java.util.List;

/**
 * Created by qiaozhiquan on 2018/3/13.
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
