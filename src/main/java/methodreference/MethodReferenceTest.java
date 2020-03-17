package methodreference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceTest {
    public static void main(String[] args) {
        Student zhangsan = new Student("zhangsan", 10);
        Student lisi = new Student("lisi", 50);
        Student wanger = new Student("wanger", 80);
        Student mazi = new Student("mazi", 20);

        List<Student> students = Arrays.asList(zhangsan, lisi, wanger, mazi);

//        students.sort((s1,s2)->Student.compareByScore(s1,s2));
//        students.forEach(s-> System.out.println(s.getScore()));
//        System.out.println("----------------");
//        students.sort(Student::compareByScore);
//        students.forEach(s-> System.out.println(s.getScore()));


        StudentCompartor studentCompartor = new StudentCompartor();
        students.sort((studentCompartor::compareByScore));
        students.forEach(s-> System.out.println(s.getScore()));
    }
}
