package combinatorDp;

import java.time.LocalDate;

public class Customer
{
    private final String name;
    private final String email;
    private final String phn;
    private final LocalDate dob;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phn='" + phn + '\'' +
                ", dob=" + dob +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhn() {
        return phn;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Customer(String name, String email, String phn, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.phn = phn;
        this.dob = dob;
    }
}
