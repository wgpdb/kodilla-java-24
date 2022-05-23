package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Attendee implements HomeworkObservable {

    private final List<HomeworkObserver> homeworkObservers;
    private final List<String> homeworkAssignments;
    private final String attendeeName;

    public Attendee(String attendeeName) {
        this.homeworkObservers = new ArrayList<>();
        this.homeworkAssignments = new ArrayList<>();
        this.attendeeName = attendeeName;
    }

    public List<String> getHomeworkAssignments() {
        return homeworkAssignments;
    }

    public String getAttendeeName() {
        return attendeeName;
    }

    public void addHomeworkAssignment(String assignment) {
        homeworkAssignments.add(assignment);
        notifyObservers();
    }

    @Override
    public void registerObserver(HomeworkObserver homeworkObserver) {
        homeworkObservers.add(homeworkObserver);
    }

    @Override
    public void notifyObservers() {
        for (HomeworkObserver homeworkObserver : homeworkObservers) {
            homeworkObserver.update(this);
        }
    }

    @Override
    public void removeObserver(HomeworkObserver homeworkObserver) {
        homeworkObservers.remove(homeworkObserver);
    }
}
