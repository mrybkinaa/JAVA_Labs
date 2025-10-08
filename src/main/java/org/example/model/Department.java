package org.example.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Human head;
    private List<Group> groups = new ArrayList<>();

    public Department(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    @Override
    public String toString() {
        return "Кафедра: " + name + ", завідувач: " + head + ", груп: " + groups.size();
    }

    public List<Group> getGroups() {
        return groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department department = (Department) o;
        return name.equals(department.name)
                && head.equals(department.head)
                && groups.equals(department.groups);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, head, groups);
    }

}
