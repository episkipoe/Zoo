package com.partek.zoo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest extends TestCase
{

    public AppTest( String testName ) {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testZoo() {
		Zoo zoo = new Zoo("Partek Zoo");

/*
    	Habitat h = zoo.getHabitat("Red Rocks");
    	h.setNumPens(2);
     	Animal l = h.getAnimal("lion");
    	h.putAnimalInPen(l);
    	Animal z = h.getAnimal("zebra");   	
    	h.putAnimalInPen(z);
    	Animal g = h.getAnimal("giraffe");   	
    	h.putAnimalInPen(g);
    
    	//assume all carnivores eat all animals
    	//assume all herbivores eat no animals
    	assertTrue(l.wantsToEat(z));
    	assertFalse(l.getPen() == z.getPen());
    	
    	assertTrue(l.wantsToEat(g));
    	assertFalse(z.wantsToEat(g));
    	assertTrue(g.getPen() == z.getPen());
    	
     	Animal t = h.getAnimal("tiger");
    	assertFalse(h.putAnimalInPen(t)); //no free pens for a carnivore
    	
    	h.visit();
    	//display a fact about Lions
    	//display a fact about Zebras
    	//display a fact about Giraffe

		//all mammals have hair
		assertTrue(l.hasHair());  
*/
    }
}
