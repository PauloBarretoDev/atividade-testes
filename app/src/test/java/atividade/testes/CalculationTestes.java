package atividade.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculationTestes {
    Calculation calc;

    @BeforeEach
    public void setup(){
        this.calc = new Calculation();
    }

    @Test
    public void teste1(){
        int[] arr = { 4, 8, 2, 10, 6 };
        int result = calc.findMax(arr);
        assertEquals(10,result);
    }

    @Test
    public void teste2(){
        int[] arr = {-2, -5, -6, -7};   
        int result = calc.findMax(arr);
        assertEquals(-2,result);
    }

    @Test
    public void teste3(){
        int[] arr = { 1, 1 , 1,1 };
        int result = calc.findMax(arr);
        assertEquals(1,result);
    }
    
}
