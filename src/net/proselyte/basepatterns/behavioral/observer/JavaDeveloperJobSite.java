package net.proselyte.basepatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite {
    List<String> vacancies = new ArrayList<>();

    List<Observer> subscribers = new ArrayList<>();

    public void addVacancy(String vacancy) {
        this.vacancies.add(vacancy);
    }

    public void removeVacancy(String vacancy) {
        this.vacancies.remove(vacancy);
    }

}
