package BezahlRechner;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;


public class BezahlungTest {

	@Test
	void calcIncomeTest() {
		assertEquals(0.7,Bezahlung.calcIncome("This is a test text to do something special for my module in university."));
		assertEquals(0,Bezahlung.calcIncome(""));
		Assertions.assertThrows(NullPointerException.class,()->{Bezahlung.calcIncome(null);
		});
		//Checking for redundancy. Doesn't work, because no such code is implemented in the Class.
		assertEquals(0,Bezahlung.calcIncome("Dieser Satz ist keine Kopie. Dieser Satz ist keine Kopie"));
	}
	@Test
	void countPicturesTest() {
		assertEquals(3,Bezahlung.countPictures("The sense of this sentence is to count as many picture word a picture sentence can have and so I'm going to end this sentence with a picture"));
	}

}
