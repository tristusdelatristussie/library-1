package com.simplon.library;

/**
 * Created by Agnieszka on 14/02/17.
 */
public enum MovieType {

    HORROR("Horror"),
    FUN("Fun"),
    ACTION("Action"),
    MUSICAL("Musical");


    private final String kind;


    MovieType(String kind) {
        this.kind = kind;
    }


    public String getKind() {
        return kind;
    }





}
