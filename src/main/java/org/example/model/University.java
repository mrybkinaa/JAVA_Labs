package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private Human head;
    private List<Faculty> faculties = new ArrayList<>();

    public University(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    @Override
    public String toString() {
        return "Університет: " + name + ", ректор: " + head + ", факультетів: " + faculties.size();
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }
}
