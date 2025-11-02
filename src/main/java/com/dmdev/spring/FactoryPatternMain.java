package com.dmdev.spring;

public class FactoryPatternMain {
    public static void main(String[] args) {
        AccountFactory accountFactory = new AccountFactory();
        Account currentAccount = accountFactory.getAccount("SAVING");
        System.out.println(currentAccount);
    }
}
