import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperatorTest test = new BinaryOperatorTest();
        System.out.println(test.compute(2,3,(a,b)->a+b));
        System.out.println(test.compute(2, 3, (a, b) -> a * b));
        System.out.println("-------------------");

        System.out.println(test.getShort("hello123","world",Comparator.comparingInt((String a)->a.length())));
        System.out.println(test.getShort("hello123","world", Comparator.comparingInt((String a) -> a.charAt(0))));
    }

    public Integer compute(Integer a, Integer b, BinaryOperator<Integer> operator) {
        return operator.apply(a,b);
    }

    public String getShort(String a, String b, Comparator<String> comparator){
            return BinaryOperator.maxBy(comparator).apply(a,b);
    }
}

