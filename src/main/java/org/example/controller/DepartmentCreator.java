package org.example.controller;

import org.example.model.Department;
import org.example.model.Group;
import org.example.model.Human;

import java.util.List;

public class DepartmentCreator {
    public Department create(String name, Human head, List<Group> groups) {
        Department dep = new Department(name, head);
        groups.forEach(dep::addGroup);
        return dep;
    }
}
