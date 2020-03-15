import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier supplier=()->"hellow world";
        System.out.println(supplier.get());
    }
}
