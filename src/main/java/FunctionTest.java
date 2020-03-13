import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest test = new FunctionTest();
        Integer result = test.compute(1, value -> 2 * value);//expression
        Integer result2 = test.compute(2, value -> {
            return 5 + value;
        });//statement
        System.out.println(result);
        System.out.println(result2);
    }
    public Integer compute(Integer a, Function<Integer,Integer> funciton){
        Integer result = funciton.apply(a);
        return result;
    }
}
