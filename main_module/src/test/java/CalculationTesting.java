/**
 * Created by yuriy.vasyliv on 18.07.2017.
 */


import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculationTesting {

    private static Calculation math;

    @BeforeClass
    public static void Initialize(){
        math = mock(Calculation.class);
    }

    @Test
    public void TestAdd() {
        when(math.Add(2.0,2.0)).thenReturn(4.0);
        assertEquals(4.0, math.Add(2.0, 2.0), 0.001);
    }

    @Test
    public void TestSubstract() {
        when(math.Substract(4.0,2.0)).thenReturn(2.0);
        assertEquals(2.0, math.Substract(4.0, 2.0), 0.001);
    }

    @Test
    public void TestMultiply() {
        when(math.Multiply(2.0,2.0)).thenReturn(4.0);
        assertEquals(4.0, math.Multiply(2.0, 2.0), 0.001);
    }

    @Test
    public void TestDivide() {
        when(math.Divide(4.0,2.0)).thenReturn(2.0);
        assertEquals(2.0, math.Divide(4.0, 2.0), 0.001);
    }
}