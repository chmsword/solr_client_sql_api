package com.chmsword.solrsql.bean;

/**
 * Created by mengcheng on 9/12/14.
 */
 public class AppException extends RuntimeException {

    private static final long serialVersionUID = -2591350796509464771L;



    public AppException(String message) {
        super(message);
    }




    public AppException(String message, Throwable cause) {
        super(message, cause);
    }
}
