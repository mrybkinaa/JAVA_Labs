package org.example.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private Human head;
    private List<Student> students = new ArrayList<>();

    public Group(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "Група: " + name + ", староста: " + head + ", кількість студентів: " + students.size();
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
        Group group = (Group) o;
        return name.equals(group.name)
                && head.equals(group.head)
                && students.equals(group.students);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, head, students);
    }

}
