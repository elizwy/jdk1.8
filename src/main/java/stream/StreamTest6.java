package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * flatmap 实现笛卡尔积
 */
public class StreamTest6 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("hi", "hello", "你好");
        List<String> list2 = Arrays.asList("zhangsan", "wanger", "manzi");
        list1.stream().flatMap(item1->list2.stream().map(item2->item1+":"+item2)).forEach(System.out::println);
    }
}
