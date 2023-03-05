package com.akwetu.workshopmongodb.exception;

public class ObjectNotFoundExcpetion extends RuntimeException{

    public ObjectNotFoundExcpetion(String message){
        super("Resource not found " + message);
    }
}
