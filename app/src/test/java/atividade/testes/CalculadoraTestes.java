package atividade.testes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

//import java.security.PublicKey;

import org.junit.jupiter.api.BeforeEach;

public class CalculadoraTestes {
    Calculadora calc;

    @BeforeEach
    public void setup(){
        this.calc = new Calculadora();
    }

    @Test
    public void somaTeste(){
        int a = 5, b = 5;
        double resultado = this.calc.somar(a,b);
        assertEquals(10,resultado);
    }

    @Test
    public void divisaoTeste(){
        int a = 5, b = 0;
        assumeTrue(b != 0);
        double resultado = this.calc.dividir(a,b);
       assertEquals(1,resultado);  
    }

}
