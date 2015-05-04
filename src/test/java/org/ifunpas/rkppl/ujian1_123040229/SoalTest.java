/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ifunpas.rkppl.ujian1_123040229;



/**
 *
 * @author SB 604-04
 */
public class SoalTest {
    private static Soal s;
    
    @Before
    public void awalTest() {
        s = new Soal();
        System.out.println("Memulai testing");
    }
    
    @Test
    public void testPangkat1(){
       assertTrue("Nilai true", s.pangkat(5, 2));
    }
    
    @Test
    public void testPangkat2() {
        assertFalse("Nilai false", s.pangkat(4, 10));
    }
    
    @Test
    public void testFaktorial1(){
        assertTrue("Nilai true", s.faktorial(5));
    }
    
    @Test
    public void testFaktorial2(){
        assertFalse("Nilai false", s.faktorial(-1));
    }
    
    @Test
    public void testPerkalian1(){
        assertTrue("Nilai true", s.perkalian(5, 2));
    }
    
    @Test
    public void testPerkalian2(){
        assertSame("Seharusnya", s.perkalian(2, 5));
    }
    
    @After
    public void akhirTest(){
        System.out.println("Mangakhiri testing");
    }
    
}
