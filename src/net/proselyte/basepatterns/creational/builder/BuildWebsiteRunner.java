package net.proselyte.basepatterns.creational.builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
