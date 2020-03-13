import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredictionTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        PredictionTest test = new PredictionTest();
        System.out.println("大于3的数");
        test.contionFilter(list, v -> v > 3);
        System.out.println("偶数");
        test.contionFilter(list,v->v%2==0);
        System.out.println("奇数");
        test.contionFilter(list,v->v%2==1);
    }

    public void contionFilter(List<Integer> list, Predicate<Integer> predicate){
        for (Integer i:list){
            if(predicate.test(i)){
                System.out.println(i);
            }
        }
    }
}
