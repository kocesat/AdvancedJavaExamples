package com.kocesat.exceptions;

// Checked -> Exception
// Unchecked (runtime) -> RuntimeException

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message) {
        super(message);
    }

    public InsufficientBalanceException() {
        super("Insufficient fund in your account");
    }
}
