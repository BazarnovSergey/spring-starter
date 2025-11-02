package com.dmdev.spring;

public class CurrentAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("Current Account");
    }
}
