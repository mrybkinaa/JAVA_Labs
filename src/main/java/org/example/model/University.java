package org.example.model;

import java.util.Objects;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof University)) return false;
        University that = (University) o;
        return name.equals(that.name)
                && head.equals(that.head)
                && faculties.equals(that.faculties);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, head, faculties);
    }

}
