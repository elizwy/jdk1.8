import java.util.function.Supplier;

/**
 * supplier 函数不接受输入参数，返回一个结果，实例工厂不需要参数时返回一个实例
 */
public class StudentTest {
    public static void main(String[] args) {
        Supplier<Student> supplier=()->new Student();
        System.out.println(supplier.get().getName());
    }
}
