package org.example.controller;

import org.example.model.*;
import java.util.ArrayList;
import java.util.List;

import org.example.model.*;

import java.util.List;

public class Run {
    public static void main(String[] args) {
        University university = createTypicalUniversity();
        System.out.println(university);
        university.getFaculties().forEach(System.out::println);
    }

    public static University createTypicalUniversity() {
        Human rector = new Human("Іван", "Петренко", "Миколайович", Sex.MALE) {};
        Human dean = new Human("Марія", "Сидоренко", "Іванівна", Sex.FEMALE) {};
        Human headOfDepartment = new Human("Олег", "Коваленко", "Олександрович", Sex.MALE) {};

        StudentCreator studentCreator = new StudentCreator();
        GroupCreator groupCreator = new GroupCreator();
        DepartmentCreator departmentCreator = new DepartmentCreator();
        FacultyCreator facultyCreator = new FacultyCreator();
        UniversityCreator universityCreator = new UniversityCreator();

        // Створюємо студентів
        Student s1 = studentCreator.create("Анна", "Мельник", "Іванівна", Sex.FEMALE, "ІТ-101");
        Student s2 = studentCreator.create("Олексій", "Бондар", "Сергійович", Sex.MALE, "ІТ-101");



        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);

        Group group = groupCreator.create("ІТ-101", s1, students);



        List<Group> groups = new ArrayList<>();
        groups.add(group);
        Department department = departmentCreator.create("Кафедра Інформатики", headOfDepartment, groups);

        List<Department> departments = new ArrayList<>();
        departments.add(department);
        Faculty faculty = facultyCreator.create("Факультет Комп’ютерних Наук", dean, departments);

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(faculty);
        University university = universityCreator.create("Національний Технічний Університет", rector, faculties);
        return university;

    }
}
