package declarative;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer
{
    public static void main(String[] args)
    {
        Customer customer = new Customer("Siva", "56");
        customerConsumer.accept(customer);
        biConsumer.accept(customer,Boolean.FALSE);
    }

    static Consumer<Customer> customerConsumer = customer
            -> System.out.println("Hello "+customer.name+" Your num is: "+customer.num);

    static BiConsumer<Customer,Boolean> biConsumer = (customer,showNum)->
            System.out.println("Hello "+customer.name+" Your num is: " + (showNum?customer.num:"******"));


    static class Customer
    {
        private final String name;
        private final String num;

        public Customer(String name, String num) {
            this.name = name;
            this.num = num;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "name='" + name + '\'' +
                    ", num='" + num + '\'' +
                    '}';
        }
    }
}
