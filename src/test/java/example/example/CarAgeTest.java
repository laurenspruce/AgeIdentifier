package example.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CarAgeTest {

    private ICarAge carAge;

    @BeforeEach
    public void setUp() {
        carAge = new CarAge(); //Initialise the CarAge object before each test
    }

    // Method to add ages to map, return ages from map, and calculate next age in map
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
    // returnNextAgeIdentifier must return a number
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
    
    // returnNextAgeIdentifier must return a two-digit number
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

    // returnNextAgeIdentifier must return a number above 00 (lowest numb)

    // returnNextAgeIdentifier must return a number below ?? (is there an actual max)

    // returnNextAgeIdentifier must return a positive number

    // calculateNextAgeIdentifier must return a LinkedHashMap key-value-pair

    // addAgeIdentifierToHashMap must let you add values to LinkedHashMap

    // addAgeIdentifierToHashMap must let you add numbers as values to LinkedHashMap

    // addAgeIdentifierToHashMap must let you add two-digit numbers as values to LinkedHashMap

    // addAgeIdentifierToHashMap must let you add Month-Year as keys to LinkedHashMap

    // calculateNextAgeIdentifier must throw an exception if hashmap emtpy
}
