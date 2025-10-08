package org.example.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private Human head;
    private List<Department> departments = new ArrayList<>();

    public Faculty(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public String toString() {
        return "Факультет: " + name + ", декан: " + head + ", кафедр: " + departments.size();
    }

    public List<Department> getDepartments() {
        return departments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty)) return false;
        Faculty faculty = (Faculty) o;
        return name.equals(faculty.name)
                && head.equals(faculty.head)
                && departments.equals(faculty.departments);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, head, departments);
    }


}
