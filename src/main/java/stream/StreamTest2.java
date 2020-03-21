package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "zwy");
        stream.map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("----------------");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().map(i->i*2).forEach(System.out::println);
        System.out.println("-----------------");
        Stream<List<Integer>> list1 = Stream.of(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(4, 5, 6));
        list1.flatMap(theList->theList.stream()).map(i->i*i).forEach(System.out::println);
        System.out.println("-----------------");

        /**
         * 找出大于2的元素，将每个元素*2，过滤前2个元素，然后取前2个元素取和
         */
        final long sum = Arrays.asList(1, 3, 5, 7, 9, 11).stream()
                .filter(n -> n > 2)
                .skip(2)
                .limit(2)
                .collect(Collectors.summarizingInt(n -> n * 2))
                .getSum();
        System.out.println(sum);
    }
}
