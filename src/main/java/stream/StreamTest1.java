package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 注销原因：stream 操作会改变原有的类，带来副作用
 */
public class StreamTest1 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "hello world");
//        String[] array = stream.toArray(String[]::new);
//        Arrays.asList(array).forEach(System.out::println);

//        stream.collect(Collectors.toList());
//        ArrayList<Object> list = stream.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
//        list.forEach(System.out::println);

        String str=stream.collect(Collectors.joining());
        System.out.println(str);

    }
}
