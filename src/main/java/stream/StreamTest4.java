package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 流将算子进行串行化操作，与短路操作
 */
public class StreamTest4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");
        list.stream().mapToInt(item->{
            System.out.println(item);
            return item.length();
        })
                .filter(length->length==5)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
