import java.util.function.Consumer;
import java.util.function.Supplier;
public class ConsumerFunction {
    public static void main(String[] args){
            Consumer<String> dumyFun = x-> System.out.println(x);
            f1(dumyFun);

        }
        public static void f1(Consumer<String> dumyFun){
            dumyFun.accept("ram");

        }
   }