package org.example.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return firstName.equals(human.firstName)
                && lastName.equals(human.lastName)
                && patronymic.equals(human.patronymic)
                && sex == human.sex;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName, lastName, patronymic, sex);
    }

}
