package com.sustav.javaeejpa;

/**
 * @author Anton Sustavov
 * @since 2018/12/23
 */
public class Main {
    public static void main(String[] args) {
        Exception exception = new Exception("Hello Exc");

        System.out.println(exception.getMessage().substring(0, 4));

    }
}
