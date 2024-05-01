/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package GUI;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testCalculoResta() {
        System.out.println("calculo Resta");
        Calculadora instance = new Calculadora(5, 3, "-",2);
        assertEquals(2.0, instance.calculo(), 0.0001);
    }
    
     @Test
    public void testCalculoSuma() {
        System.out.println("calculo Suma");
        Calculadora instance = new Calculadora(5, 3, "+",8);
        assertEquals(8.0, instance.calculo(), 0.0001);
    }

      @Test
    public void testCalculoSumaMultiplicacion() {
        System.out.println("calculo Multiplicacion");
        Calculadora instance = new Calculadora(5, 3, "*",15);
        assertEquals(15.0, instance.calculo(), 0.0001);
    }
    
       @Test
    public void testCalculoSumaDivision() {
        System.out.println("calculo Division");
        Calculadora instance = new Calculadora(6, 3, "/",2);
        assertEquals(2.0, instance.calculo(), 0.0001);
    }
    
}
