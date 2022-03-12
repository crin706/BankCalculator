package ru.bankCount.mar;

public class JavaBank implements Bank {

    protected double moneyInBank;

    @Override
    public double calculatePercent(double salaryForDeposit, int depositTerm) {
        moneyInBank = salaryForDeposit * personRate(depositTerm, moneyInBank) / 100;
        return moneyInBank;
    }

    public double personRate(int depositTermInYears, double moneyInBank) {
        double rate = 5;
        if (moneyInBank >= 100000 && moneyInBank < 500000) {
            rate = 6;
        } else if (moneyInBank >= 500000) {
            rate = 7;
        }
        rate = depositTermInYears >= 20 ? rate + 0.5 : rate;
        return rate;
    }
}
