package example.example;

import java.util.LinkedHashMap;

public class CarAge implements ICarAge{


    private LinkedHashMap<String, Integer> ageMap;

    public CarAge() {
        ageMap = new LinkedHashMap<>();
    }

    @Override
    public void addAgeIdentifierToHashMap(String date, int age) {
        if (age < 0 || age > 99) {
            throw new IllegalArgumentException("Age must be between 0 and 99.");
        }
        ageMap.put(date,age);
    }

    @Override
    public int returnNextAgeIdentifier() {
        if (ageMap.isEmpty()) {
            throw new IllegalArgumentException("No ages present in the map.");
        }
        return ageMap.values().stream()
                .max(Integer::compare)
                .orElseThrow(() -> new IllegalStateException("No ages are available."));
    }

    @Override
    public LinkedHashMap<String, Integer> calculateNextAgeIdentifier() {
        if (ageMap.isEmpty()) {
            throw new IllegalStateException("Age map is empty.");
        }
        return new LinkedHashMap<>(ageMap);
    }


    public LinkedHashMap<String, Integer> returnAgesFromMap() {
        return ageMap;
    }
}
