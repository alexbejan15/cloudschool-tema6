package com.db.temaSpital.exceptions;

public class NoDoctorException extends Exception{
    public NoDoctorException(){
        super("Doctor doesn't exist!");
    }
}