package ru.bankCount.mar;

public class Splitter extends Client {

    public Splitter(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    int calcSavings(JavaBank bank, int years) {
        rateFromSalary = 0.3;

        //расчет, когда счет вклада кратен 3 годам
        for (int i = 0; i < years / 3; i++) {
            customerMoneyInBank += salary * rateFromSalary;
            for (int j = 0; j < 3; j++) {
                customerMoneyInBank += (int) (bank.calculatePercent(customerMoneyInBank, years));
            }
        }
        //расчет последнего вклада, когда его срок в последнем периоде меньше 3 лет (не кратно 3 годам)
        if (years % 3 != 0) {
            customerMoneyInBank += salary * rateFromSalary;
            for (int x = 0; x < years % 3; x++) {
                customerMoneyInBank += (int) (bank.calculatePercent(customerMoneyInBank, years));
            }
        }
        return customerMoneyInBank;
    }
}
