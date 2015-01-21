package com.chmsword.solrsql.bean;

/**
 * Created by mengcheng on 9/12/14.
 */
public class UnsupportedException extends Exception {
    private static final long serialVersionUID = -25913522209464771L;
    public UnsupportedException(String error){
        super(error);
    }


}
