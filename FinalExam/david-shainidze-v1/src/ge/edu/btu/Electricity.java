package ge.edu.btu;

public class Electricity {
    String customerNumber;
    double amount;

    Electricity() {
    }

    Electricity(String customerNumber, double amount) {
        this.customerNumber = customerNumber;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("Electricity(customerNumber='%s', amount=%f)", this.customerNumber, this.amount);
    }
}
