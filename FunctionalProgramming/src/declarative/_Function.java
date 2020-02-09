package declarative;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function
{
    public static void main(String[] args)
    {
        Integer num = inc.andThen(mul).apply(4);
        System.out.println(num);

        String s = stringBiFunction.apply("Siva", "Ganesh");
        System.out.println(s);
    }
    static Function<Integer,Integer> inc  = num->num+1;
    static Function<Integer,Integer> mul = num->num*10;
    static BiFunction<String,String ,String> stringBiFunction = (a,b)-> a.replace("a","A") +" " +b;
}
