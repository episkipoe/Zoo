package com.partek.zoo;

import com.partek.zoo.animals.*;
import com.partek.zoo.habitats.Habitat;

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
    	
	//  Animals want to eat

     	Animal lion = new Lion();
    	Animal zebra = new Zebra();
    	//assume all carnivores eat all animals
    	//assume all herbivores eat no animals
    	assertTrue(lion.wantsToEat(zebra));
    	
    	Animal giraffe = new Giraffe();
    	assertTrue(lion.wantsToEat(giraffe));
    	assertFalse(zebra.wantsToEat(giraffe));
    	
    //  Putting animals in pens
 		Zoo zoo = new Zoo("Partek Zoo");

    	Habitat habitat = zoo.getHabitat("Red Rocks");
    	habitat.setNumPens(2);  //it's a small habitat
       	
    	habitat.putAnimalInPen(lion);
    	habitat.putAnimalInPen(zebra);
    	habitat.putAnimalInPen(giraffe);
    	assertTrue(habitat.getPen(giraffe) == habitat.getPen(zebra));
    	assertFalse(habitat.getPen(lion) == habitat.getPen(zebra));
    	
     	Animal tiger = new Tiger();
    	assertFalse(habitat.putAnimalInPen(tiger)); //no free pens for a carnivore
    	
    //  The animal kingdom
    	
		//all mammals have hair
//		assertTrue(lion.hasHair());  
    }
}
