package com.partek.zoo;

import com.partek.zoo.animals.Animal;
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
    	
	//Section 1:  Animals want to eat
     	Animal lion = new Lion();
    	Animal zebra = new Zebra();
    	//assume all carnivores eat all animals
    	//assume all herbivores eat no animals
    	assertTrue(lion.wantsToEat(zebra));
    	
    	Animal giraffe = new Giraffe();
    	assertTrue(lion.wantsToEat(giraffe));
    	assertFalse(zebra.wantsToEat(giraffe));
    
    //Section 2:  Putting animals in pens
 		Zoo zoo = new Zoo("Partek Zoo");

    	Habitat habitat = zoo.getHabitat("Red Rocks");
    	habitat.setNumPens(2);  //it's a small habitat
       	
    	habitat.putAnimalInPen(lion);
    	habitat.putAnimalInPen(zebra);
    	habitat.putAnimalInPen(giraffe);
    	assertTrue(giraffe.getPen() == zebra.getPen());
    	assertFalse(lion.getPen() == zebra.getPen());
    	
     	Animal tiger = new Tiger();
    	assertFalse(habitat.putAnimalInPen(tiger)); //no free pens for a carnivore
    
    //Section 3:  A simple visit
    	habitat.visit();
    	//prints: 
    	//Visited lion in Pen 0
    	//Visited zebra in Pen 1
    	//Visited giraffe in Pen 1

    //Section 4:  The animal kingdom
		//all mammals have hair
		assertTrue(lion.hasHair());  
    }
}
