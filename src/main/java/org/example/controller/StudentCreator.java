package org.example.controller;

import org.example.model.Sex;
import org.example.model.Student;

public class StudentCreator {
    public Student create(String first, String last, String patronymic, Sex sex, String group) {
        return new Student(first, last, patronymic, sex, group);
    }
}
