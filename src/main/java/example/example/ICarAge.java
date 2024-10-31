package example.example;


import java.util.LinkedHashMap;

public interface ICarAge {
    void addAgeIdentifierToHashMap(String date, int age);
    int returnNextAgeIdentifier();
    LinkedHashMap<String, Integer> calculateNextAgeIdentifier();
}
