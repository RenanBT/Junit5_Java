package br.com.betereli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



@DisplayName("Test simple math operations")
class SimpleMathTest {
	
	SimpleMath math;
	@BeforeAll
	static void setup() {
		System.out.println("Running @BeforeAll method");
	}
	
	@AfterAll
	static void cleanup() {
		System.out.println("Running @AfterAll method");
	}
	
	@BeforeEach
	void beforeEachMethod() {
		math = new SimpleMath();
		System.out.println("Running @BeforeEach method");
		
	}
	
	@AfterEach
	void afterEachMethod() {
		math = new SimpleMath();
		System.out.println("Running @AfterEach method");
		
	}
	

    @Test
    @DisplayName("Test 6.2+2=8.2")
    void testSum() {
    	// AAA = Arrange, Act, Assert
    	//Given
        
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        double expected = 8.2D;
        
      //When
        Double actual = math.sum(firstNumber, secondNumber);
        
        //Then
        assertEquals(expected, actual,
            () -> firstNumber + "+" + secondNumber +
            " did not produce " + expected + "!");
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
    }
    
    @Test
    @DisplayName("Test 6.2-2 = 4.2")
    void testSub()
    {
    	double firstNumber = 6.2D;
        double secondNumber = 2D;
        
        Double actual = math.subtraction(firstNumber, secondNumber);
        double expected = 4.2D;
        assertEquals(expected, actual,
                () -> firstNumber + "-" + secondNumber +
                " did not produce " + expected + "!");
        

    }
    
    @Test
    @DisplayName("Test 5 * 2 = 10")
    void testMult() {
        double firstNumber = 5.0D;
        double secondNumber = 2D;
        
        Double actual = math.multiplication(firstNumber, secondNumber); 
   
        double expected = 10D;
        assertEquals (expected, actual,() -> firstNumber + "*" + secondNumber +
        " did not produce " + expected + "!");
    	
    	
    }
    
    @Test
    void testDiv() {
    	double firstNumber = 10D;
        double secondNumber = 2D;
        Double actual = math.division(firstNumber, secondNumber);
        double expected = 5.0;
        assertEquals (expected, actual,() -> firstNumber + " / " + secondNumber +
                " did not produce " + expected + "!");
    }
    @Test
    void testAverage() {
    	
        double firstNumber = 3D;
        double secondNumber = 9D;
        
        Double actual = math.mean(firstNumber , secondNumber);
        double expected = 6D;
        assertEquals (expected, actual,() -> "(" + firstNumber + " + " + secondNumber + ") / 2"+
                " did not produce " + expected + "!");
    	
    	
    }
    
    @Test
    void testSquaredRoot() {
    	
        double firstNumber = 81D;  
        Double actual = math.squareRoot(firstNumber);
        double expected = 9D;
    	
    }
   // @Disabled("TODO: Need to work on it")
    @Test
    @DisplayName("Test Divison by Zero")
    void testDivision_When_FirstNumberIsDivivedByZero_ShouldThrowArithmeticException() {
    	//given
    	double firstNumber = 3D;
        double secondNumber = 0D;
        var expectedMessage = "Impossible to divide by zero.";
        // when & then
        ArithmeticException actual = assertThrows(ArithmeticException.class, () -> {
        	math.division(firstNumber, secondNumber);
        }, () -> "Diision by zero should throw an ArithmeticException");
        
        assertEquals(expectedMessage, actual.getMessage(), () -> "Unexpected exception message!");
    }
    
    // test[Sysem under Test]
	@DisplayName("Display Name")
	@Test
	void testABCD() {
		// AAA = Arrange, Act, Assert
		//Given / Arrange
		//When / Act
		//Then / Assert

	}
    

}
