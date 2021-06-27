package Mocking;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class KlasseBTest {
    KlasseB b;
    
    @Test
    void MultiplyTest() {
        KlasseA A = mock(KlasseA.class); 
        
        when(A.minusCalc(125,25)).thenReturn(100);
        b = new KlasseB(A);

        assertEquals(625, b.Multiply(25));
    }
}
