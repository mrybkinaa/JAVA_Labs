package org.example.controller;

import org.example.model.Department;
import org.example.model.Faculty;
import org.example.model.Human;

import java.util.List;

public class FacultyCreator {
    public Faculty create(String name, Human head, List<Department> departments) {
        Faculty f = new Faculty(name, head);
        departments.forEach(f::addDepartment);
        return f;
    }
}
