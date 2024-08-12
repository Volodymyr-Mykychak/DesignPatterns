package net.proselyte.basepatterns.behavioral.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "PostgreSQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Eugene Suleiamnov", skills);


        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");


    }
}
