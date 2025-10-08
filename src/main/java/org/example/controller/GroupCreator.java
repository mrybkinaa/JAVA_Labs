package org.example.controller;

import org.example.model.Group;
import org.example.model.Human;
import org.example.model.Student;

import java.util.List;

public class GroupCreator {
    public Group create(String name, Human head, List<Student> students) {
        Group group = new Group(name, head);
        students.forEach(group::addStudent);
        return group;
    }
}
