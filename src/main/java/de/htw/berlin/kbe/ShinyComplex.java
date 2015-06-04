package de.htw.berlin.kbe;

import de.htw.berlin.kbe.annotation.ExtendedCreationInfo;
import de.htw.berlin.kbe.interfaces.Interface1;
import de.htw.berlin.kbe.interfaces.Interface2;

/**
 * Created by drummer on 03.06.2015.
 */
@ExtendedCreationInfo(author = "Simon", description = "SomeDesc", baseClass = AbstractBaseClass.class,
		interfaces = { Interface1.class, Interface2.class }, tags = { "Tag1", "Tag2" })
public class ShinyComplex extends AbstractBaseClass implements Interface1, Interface2 {

	public void someMethod() {

	}
}
