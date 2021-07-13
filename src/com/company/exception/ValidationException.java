package com.company.exception;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 13.07.2021.
 * Time: 21:32.
 */
public class ValidationException extends Exception{
    public ValidationException(String message) {
        super(message);
    }
}