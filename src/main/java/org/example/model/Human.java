package org.example.model;

public abstract class Human {
    protected String firstName;
    protected String lastName;
    protected String patronymic;
    protected Sex sex;

    public Human(String firstName, String lastName, String patronymic, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return firstName + " " + patronymic + " " + lastName + " (" + sex + ")";
    }
}
