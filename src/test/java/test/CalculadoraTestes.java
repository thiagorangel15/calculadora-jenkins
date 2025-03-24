package test;

import control.Calculadora;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTestes {
    @Test
    public void testeSomar(){
        Calculadora calculadora = new Calculadora();
        Assert.assertEquals(5.0, calculadora.somar(2.0,3.0),0.0);
    }

    @Test
    public void testeSubtrair(){
        Calculadora calculadora = new Calculadora();
        Assert.assertEquals(1.0, calculadora.subtrair(3.0,2.0),0.0);
    }

    @Test
    public void testeMultiplicar(){
        Calculadora calculadora = new Calculadora();
        Assert.assertEquals(6.0, calculadora.multiplicar(3.0,2.0),0.0);
    }

    @Test
    public void testeDividir() {
        Calculadora calculadora = new Calculadora();
        Assert.assertEquals(1.0, calculadora.dividir(3.0,3.0),0.0);
    }
}
