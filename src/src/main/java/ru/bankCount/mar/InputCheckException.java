package ru.bankCount.mar;

//проверяемое исключение
public class InputCheckException extends ClassNotFoundException {
    public InputCheckException() {
        super("Not enough data. Please fill all fields correctly.");
    }

}
