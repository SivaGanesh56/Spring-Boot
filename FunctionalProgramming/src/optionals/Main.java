package optionals;

import java.util.Optional;

public class Main
{
    public static void main(String[] args) {
        //Object value = Optional.ofNullable("Siva").orElseGet(() -> "Default Value");
        //Object value = Optional.ofNullable(null).orElseThrow(() -> new IllegalStateException("Some Exception"));
        Optional.ofNullable("Siva ").ifPresent(mail-> System.out.println("Sending Mail to "+mail));
        //System.out.println(value);
    }
}
