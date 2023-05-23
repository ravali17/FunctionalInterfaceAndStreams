import java.util.function.Supplier;

public class SupplierFunction {

    public static void f1(Supplier<String>fun){
        String s1=fun.get();
        System.out.println(s1);
    }


    public static void main(String[] args) {
        Supplier<String>supfun=()->{
    return "ravi";
        };

        f1(supfun);
    }
}
