package stream;

import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * 串行流与并行流比较
 */
public class StreamTest3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(5000);
        for(int i=0;i<5000;i++){
            list.add(UUID.randomUUID().toString());
        }
        System.out.println("串行流开始排序");
        long start=System.nanoTime();
        list.stream().sorted().count();
        long end=System.nanoTime();
        System.out.println("串行流排序耗时:"+ TimeUnit.NANOSECONDS.toMillis(end-start));

        System.out.println("并行流开始排序");
         start=System.nanoTime();
        list.parallelStream().sorted().count();
         end=System.nanoTime();
        System.out.println("并行流排序耗时:"+ TimeUnit.NANOSECONDS.toMillis(end-start));
    }
}
