package org.example.model;

import java.util.Objects;


public class Student extends Human {
    private String groupName;

    public Student(String firstName, String lastName, String patronymic, Sex sex, String groupName) {
        super(firstName, lastName, patronymic, sex);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return "Студент: " + super.toString() + ", група: " + groupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return groupName.equals(student.groupName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), groupName);
    }

}
