import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyTest3 {
    public static void main(String[] args) {
        TheInterface i1=()->{};
        System.out.println(i1.getClass().getInterfaces()[0]);
        TheInterface2 i2=()->{};
        System.out.println(i2.getClass().getInterfaces()[0]);


        List<String> list = Arrays.asList("hello", "world", "helloworld");
        list.forEach(item->{
            System.out.println(item);
        });

        list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(i-> System.out.println(i));
    }
}
@FunctionalInterface
interface TheInterface {
    void myMethod();
}
@FunctionalInterface
interface TheInterface2 {
    void myMethod2();
}
