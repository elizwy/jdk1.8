import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringComparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("zhang", "li", "ao", "ming");
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
        Collections.sort(list,Comparator.reverseOrder());
//        Collections.sort(list,((o1, o2) -> o1.compareTo(o2)));
    }
}
