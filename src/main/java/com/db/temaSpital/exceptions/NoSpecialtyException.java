package com.db.temaSpital.exceptions;

public class NoSpecialtyException extends Exception{
    public NoSpecialtyException(){
        super("Specialty doesn't exist!");
    }
}