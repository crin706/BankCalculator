package ru.bankCount.mar;

public abstract class Client{

    protected String name;
    private int age;
    protected double salary;
    protected double rateFromSalary = 0.1;
    protected int customerMoneyInBank = 0;



    public Client(String name, int age, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    abstract int calcSavings(JavaBank bank, int years);
//    {
//        for (int i = 0; i < years; i++) {
//            customerMoneyInBank = (int) (customerMoneyInBank + salary * rateFromSalary
//                    + bank.calculatePercent(customerMoneyInBank + (salary * rateFromSalary), years));
//        }
//        return customerMoneyInBank;
//    }
}