package stream;

import java.util.Arrays;
import java.util.List;

/**
 * 单词去重
 */
public class StreamTest5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello world", "hello", "world", "hello welcome");
        list.stream().map(item->item.split(" ")).flatMap(Arrays::stream).distinct().forEach(System.out::println);
    }
}
