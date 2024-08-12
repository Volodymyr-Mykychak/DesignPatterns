package net.proselyte.basepatterns.behavioral.strategy;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.executeActivity();

        developer.executeActivity();

        developer.executeActivity();

        developer.executeActivity();

        developer.executeActivity();
    }
}