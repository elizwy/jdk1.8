package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * stream 实现sql 分组
 */
public class StreamTest7 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 100, 23);
        Student student2 = new Student("wanger", 90, 20);
        Student student3 = new Student("mazi", 90, 23);
        Student student4 = new Student("zhangsan", 60, 21);

        List<Student> students = Arrays.asList(student1, student2, student3, student4);
        Map<String, List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getName));
        System.out.println(map);
    }
}
