package example.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class CarAgeTest {

    private ICarAge carAge;
    // Method to add ages to map, return ages from map, and calculate next age in map
    @BeforeEach
    public void setUp() {
        carAge = new CarAge(); //Initialise the CarAge object before each test
    }

    // returnNextAgeIdentifier must return a number
    @Test
    public void return_next_age_identifier_should_return_a_number() {
        //Arrange
        carAge.addAgeIdentifierToHashMap("03-2023",23);
        int expectedResult = 23;

        //Act
        int actualResult = carAge.returnNextAgeIdentifier();

        //Assert
        assertEquals(expectedResult, actualResult);
    }

    // returnNextAgeIdentifier must return a two-digit number
    @Test
    public void return_next_age_identifier_should_return_two_digit_number() {
        // Arrange
        carAge.addAgeIdentifierToHashMap("03-2023", 45);
        int expectedResult = 45;

        // Act
        int actualResult = carAge.returnNextAgeIdentifier();

        // Assert
        assertTrue(actualResult >= 10 && actualResult <= 99);
        assertEquals(expectedResult, actualResult);
    }

    // returnNextAgeIdentifier must return a number above 0
    @Test
    public void returnNextAgeIdentifier_ShouldReturnAboveZero() {
        // Arrange
        carAge.addAgeIdentifierToHashMap("03-2023", 10);
        int expectedResult = 10;

        // Act
        int actualResult = carAge.returnNextAgeIdentifier();

        // Assert
        assertTrue(actualResult > 0);
        assertEquals(expectedResult, actualResult);
    }

    // returnNextAgeIdentifier must return a number below 100
    @Test
    public void return_next_age_identifier_should_return_below_hundred() {
        // Arrange
        carAge.addAgeIdentifierToHashMap("03-2023", 99);
        int expectedResult = 99;

        // Act
        int actualResult = carAge.returnNextAgeIdentifier();

        // Assert
        assertTrue(actualResult < 100);
        assertEquals(expectedResult, actualResult);
    }

    // returnNextAgeIdentifier must return a positive number
    @Test
    public void returnNextAgeIdentifier_ShouldReturnPositiveNumber() {
        // Arrange
        carAge.addAgeIdentifierToHashMap("03-2023", 1);
        int expectedResult = 1;

        // Act
        int actualResult = carAge.returnNextAgeIdentifier();

        // Assert
        assertTrue(actualResult > 0);
        assertEquals(expectedResult, actualResult);
    }

    // calculateNextAgeIdentifier must return a LinkedHashMap key-value-pair
    @Test
    public void calculateNextAgeIdentifier_ShouldReturnLinkedHashMap() {
        // Arrange
        carAge.addAgeIdentifierToHashMap("03-2023", 25);
        LinkedHashMap<String, Integer> expectedResult = new LinkedHashMap<>();
        expectedResult.put("03-2023", 25);

        // Act
        LinkedHashMap<String, Integer> actualResult = carAge.calculateNextAgeIdentifier();

        // Assert
        assertNotNull(actualResult);
        assertEquals(expectedResult, actualResult);
    }
    
    // addAgeIdentifierToHashMap must let you add values to LinkedHashMap

    // addAgeIdentifierToHashMap must let you add numbers as values to LinkedHashMap

    // addAgeIdentifierToHashMap must let you add two-digit numbers as values to LinkedHashMap

    // addAgeIdentifierToHashMap must let you add Month-Year as keys to LinkedHashMap

    // calculateNextAgeIdentifier must throw an exception if hashmap emtpy
}
