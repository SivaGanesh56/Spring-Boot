package declarative;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate
{
    public static void main(String[] args)
    {
        System.out.println(validateNum.test("+917661006553"));
        System.out.println(validateNum.test("+009507292021"));
        System.out.println("---------BiPredicate--------------");
        System.out.println(checking.test("Siva","india"));
        System.out.println(".................Validating Profile.................");
        System.out.println(validateNum.or(contains2).test("+916739303033"));   // OR
        System.out.println(validateNum.and(contains2).test("+917661006552"));  // AND
    }

    static Predicate<String > validateNum = num->num.startsWith("+91") && num.length()==13;

    static BiPredicate<String,String> checking = (name,country)->name.length()<=10 && country.equalsIgnoreCase("India");

    static Predicate<String> contains2 = num -> num.contains("2");
}
