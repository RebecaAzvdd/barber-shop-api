package me.dio.exception;

public class PhoneInUseException extends RuntimeException {
    public PhoneInUseException(String message) {
        super(message);
    }
}
