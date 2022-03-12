package ru.bankCount.mar;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InputCheckException {
        Saver client1 = null;
        Splitter client2 = null;
        int result = 0;

        Scanner in = new Scanner(System.in);
        int salaryClient1 = in.nextInt();
        int salaryClient2 = in.nextInt();
        in.close();
        client1 = new Saver("John", 17, salaryClient1);
        client2 = new Splitter("Bill", 27, salaryClient2);
        if ( client1 == null || client2 == null) {
            throw new InputCheckException();
        }
        try {
            result = compare(client1, client2, new JavaBank(), 10);
        } catch (DepositTermException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }

    static int compare(Client client1, Client client2, JavaBank bank, int depositTerm) throws DepositTermException {
        int difference;
        if (depositTerm > 0) {
            difference = client1.calcSavings(bank, depositTerm) - client2.calcSavings(bank, depositTerm);
        } else {
            throw new DepositTermException(depositTerm);
        }
        return difference;
    }
}
