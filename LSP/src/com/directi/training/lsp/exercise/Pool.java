package com.directi.training.lsp.exercise;

public class Pool {
    public void run() {
        Toy donaldDuck = new Duck();
        Toy electricDuck = new SwimmingDuck();
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(Toy... toys) {
        for (Toy toy : toys) {
            toy.quack();
        }
    }

    private void swim(Toy... toys) {
        for (Toy toy : toys) {
            toy.swim();
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}
