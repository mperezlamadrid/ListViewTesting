package com.example.manuelperez.listviewtesting;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    /*public void addition_2(){
        Celular c = new Celular("Nokia","Negro",1.5,200000);
        Celular c1 = new Celular("Nokia","Blanco",1.5,100000);
        Celular c2 = new Celular("Nokia","Blanco",1.5,50000);

        Celular[] celulares = {c, c1, c2};
        Celular[] masBaratos = {c, c1};

        assertArrayEquals(masBaratos, Metodos.masBaratos(celulares));
    }*/
}