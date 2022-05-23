package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HomeworkTestSuite {

    @Test
    public void testHomeworkNotifications() {
        //Given
        Attendee attendee1 = new Attendee("Attendee 1");
        Attendee attendee2 = new Attendee("Attendee 2");

        Mentor johnSmith = new Mentor("John Smith");
        Mentor annaKowalski = new Mentor("Anna Kowalski");

        attendee1.registerObserver(johnSmith);
        attendee2.registerObserver(annaKowalski);

        //When
        attendee1.addHomeworkAssignment("Assignment 1");
        attendee1.addHomeworkAssignment("Assignment 2");
        attendee2.addHomeworkAssignment("Assignment 3");
        attendee2.addHomeworkAssignment("Assignment 4");

        //Then
        assertEquals(2, johnSmith.getHomeworkCount());
        assertEquals(2, annaKowalski.getHomeworkCount());
    }
}