package de.htw.berlin.kbe;

import org.junit.Test;

/**
 * Created by drummer on 03.06.2015.
 */
public class ShinyClassTester {

	@Test
	public void testShiny() {

		ShinyClass shinyClass = new ShinyClass();
		shinyClass.setSomeString("SomeStringFunny");

		//		AnnotationReader.readCreationInfo(shinyClass);

		AnnotationReader.readAnnotationFromClass(shinyClass);

	}

	@Test
	public void testShinyComplex() {

		ShinyComplex shinyComplex = new ShinyComplex();

		AnnotationReader.readAnnotationFromClass(shinyComplex);
	}

}
