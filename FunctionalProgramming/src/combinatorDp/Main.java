package combinatorDp;

import java.time.LocalDate;
import combinatorDp.CustomerRegistrationValidator.*;

import static combinatorDp.CustomerRegistrationValidator.*;
import static combinatorDp.CustomerRegistrationValidator.ValidationResult.*;

public class Main
{
    public static void main(String[] args) {
            Customer customer = new Customer("Siva","siva@gmail.com",
                    "9670016535", LocalDate.of(1999,05,10));
// Custom Process
//            CustomerValidatorService customerValidatorService = new CustomerValidatorService();
//        System.out.println(customerValidatorService.isValid(customer));

        // Combinator Design Pattern

        ValidationResult result = isEmailValid().and(isPhonevalid().and(isAdult())).apply(customer);
        System.out.println(result);
        if(result!= SUCCESS)
        {
            throw new IllegalMonitorStateException("Exception");
        }
    }
}
