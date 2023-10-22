package com.directi.training.lsp.exercise;

public class SwimmingDuck extends ElectronicDuck {

    @Override
    public void quack() {
        this.turnOn();
        super.quack();
    }

    @Override
    public void swim() {
        this.turnOn();
        super.swim();
    }

}
