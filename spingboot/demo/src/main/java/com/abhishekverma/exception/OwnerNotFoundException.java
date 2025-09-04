package com.abhishekverma.exception;

public class OwnerNotFoundException extends Exception {
    public String getMessage() {
        return "Owner not found exception";
    }
}
