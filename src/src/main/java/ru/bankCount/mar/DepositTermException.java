package ru.bankCount.mar;//непроверяемое исключение

public class DepositTermException extends RuntimeException {

    public DepositTermException(int depositTerm) {
        super("Not possible to open deposit if term is less than 1 year."
                + "You put: " + depositTerm + " years.");
    }
}
