import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(1);
        list.add("河池学院");
        list.add("逸夫楼410");
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
