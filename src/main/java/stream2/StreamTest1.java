package stream2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamTest1 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 70);
        Student student2 = new Student("wanger", 80);
        Student student3 = new Student("mazi", 60);
        Student student4 = new Student("zhaoliu", 90);

        Arrays.asList(student1, student2, student3, student4)
                .stream().collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("------------------");
    }
}
