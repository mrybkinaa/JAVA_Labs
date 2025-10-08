package org.example.controller;

import org.example.model.Faculty;
import org.example.model.Human;
import org.example.model.University;

import java.util.List;

public class UniversityCreator {
    public University create(String name, Human head, List<Faculty> faculties) {
        University u = new University(name, head);
        faculties.forEach(u::addFaculty);
        return u;
    }
}
