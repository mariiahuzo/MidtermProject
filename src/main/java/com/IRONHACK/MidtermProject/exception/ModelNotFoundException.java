package com.IRONHACK.MidtermProject.exception;

public class ModelNotFoundException extends RuntimeException {
    public ModelNotFoundException(Class<?> aClass, Long id) {
        super(String.format("%s not found by id %d", aClass.getSimpleName(), id));
    }
}
