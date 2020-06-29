package com.tcs.assurance.prueba.exceptions;

public class RegisterExceptions extends AssertionError {
    public RegisterExceptions(String constants, Throwable throwable) {
        super(constants, throwable);
    }
}
