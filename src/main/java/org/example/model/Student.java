package org.example.model;

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
}
