package org.example.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.model.University;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonManager {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void writeToJsonFile(University university, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(university, writer);
        } catch (IOException e) {
            throw new RuntimeException("Помилка запису у JSON файл: " + e.getMessage());
        }
    }

    public static University readFromJsonFile(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            return gson.fromJson(reader, University.class);
        } catch (IOException e) {
            throw new RuntimeException("Помилка зчитування JSON файлу: " + e.getMessage());
        }
    }
}
