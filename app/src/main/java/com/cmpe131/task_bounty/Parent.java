package com.cmpe131.task_bounty;

public class Parent {

    private int pin;
    private boolean parentMode;

    // create parent user when you set the pin first time
    public Parent(int pin) {
        this.pin = pin;
        this.parentMode = true;
    }

    public void setPin(int pin) { this.pin = pin; }
    public int getPin() { return pin; }

    public void setParentMode(boolean setMode) { parentMode = setMode; }
    public boolean getParentMode() { return parentMode; }
}