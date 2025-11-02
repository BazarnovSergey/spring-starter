package com.dmdev.spring;

public class SavingAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("Saving account");
    }
}
