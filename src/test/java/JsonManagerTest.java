import org.example.controller.JsonManager;
import org.example.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonManagerTest {

    @Test
    public void testUniversityJsonSerialization() {
        // === 1. Створення об’єкта oldUniversity ===
        Student rector = new Student("Іван", "Петренко", "Миколайович", Sex.MALE, "Ректор");

        // --- Створюємо факультети ---
        Faculty f1 = new Faculty("ФІТ", rector);
        Faculty f2 = new Faculty("ФЕА", rector);

        // --- Створюємо кафедри ---
        Department d1 = new Department("Кафедра ІТ", rector);
        Department d2 = new Department("Кафедра ЕОМ", rector);

        f1.addDepartment(d1);
        f1.addDepartment(d2);

        // --- Створюємо групи ---
        Group g1 = new Group("ІТ-101", rector);
        Group g2 = new Group("ІТ-102", rector);

        d1.addGroup(g1);
        d1.addGroup(g2);

        // --- Створюємо студентів ---
        Student s1 = new Student("Анна", "Мельник", "Іванівна", Sex.FEMALE, "ІТ-101");
        Student s2 = new Student("Олексій", "Бондар", "Сергійович", Sex.MALE, "ІТ-101");
        g1.addStudent(s1);
        g1.addStudent(s2);

        // --- Створюємо університет ---
        University oldUniversity = new University("Національний Технічний Університет", rector);
        oldUniversity.addFaculty(f1);
        oldUniversity.addFaculty(f2);

        // === 2. Запис у JSON файл ===
        String path = "university.json";
        JsonManager.writeToJsonFile(oldUniversity, path);

        // === 3. Зчитування з JSON файлу ===
        University newUniversity = JsonManager.readFromJsonFile(path);

        // === 4. Перевірка еквівалентності ===
        assertEquals(oldUniversity, newUniversity, "Університети не співпадають після серіалізації/десеріалізації!");
    }
}
