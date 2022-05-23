package com.kodilla.patterns2.observer.homework;

public class Mentor implements HomeworkObserver {

    private final String mentorName;
    private int homeworkCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(Attendee attendee) {
        int size = attendee.getHomeworkAssignments().size();
        String noun = size == 1 ? " assignment" : " assignments";
        System.out.println(mentorName + ": New homework assignment to be checked from: " +
                attendee.getAttendeeName() + "\n" + " (total: " + size + " homework" + noun + ")");
        homeworkCount++;
    }

    public int getHomeworkCount() {
        return homeworkCount;
    }
}