    package com.kocesat.exceptions;

import java.io.IOException;

public class Account {
    private float balance;

    public void deposit(float value) throws IOException {
        if (value <= 0)
            throw new IOException();
    }

    public void withdraw(float value) throws AccountException {
        if (value > balance) {
//            var fundsException = new InsufficientBalanceException();
            throw new AccountException(new InsufficientBalanceException());
//            accountException.initCause(fundsException);
//            throw accountException;
        }

    }
}
