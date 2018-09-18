/**
 * Created by qiaozhiquan on 2018/3/14.
 */
public class NameResponsitory implements Container {

    public String []name = {"Robert" , "John" ,"Julie" , "Lora"};
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if(index < name.length){
                return  true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return name[index++];
            }

            return null;
        }
    }
}
