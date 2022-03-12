package ru.bankCount.mar;

public class Saver extends Client {

    public Saver(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    int calcSavings(JavaBank bank, int years) throws RuntimeException {
        rateFromSalary = 0.15;
        for (int i = 0; i < years; i++) {
            customerMoneyInBank = (int) (customerMoneyInBank + salary * rateFromSalary
                    + bank.calculatePercent(customerMoneyInBank + (salary * rateFromSalary), years));
        }
        return customerMoneyInBank;
    }
}
