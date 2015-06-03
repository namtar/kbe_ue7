package de.htw.berlin.kbe;

import de.htw.berlin.kbe.annotation.CreationInfo;

/**
 * Created by drummer on 03.06.2015.
 */
@CreationInfo(author = "Mel", description = "Firefly", tags = { "Leaf", "In the mind", "Shiny spacecraft repair" })
public class ShinyClass {

	private String someString;

	public String getSomeString() {
		return someString;
	}

	public void setSomeString(String someString) {
		this.someString = someString;
	}

	@Override
	public String toString() {
		return "ShinyClass{" +
				"someString='" + someString + '\'' +
				'}';
	}
}
