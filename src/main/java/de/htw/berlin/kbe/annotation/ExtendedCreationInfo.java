package de.htw.berlin.kbe.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Objects;

/**
 * Created by drummer on 03.06.2015.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ExtendedCreationInfo {

	String author() default "Matthias Drummer";

	String description();

	String[] tags() default {};

	Class baseClass() default Object.class;

	Class[] interfaces() default { Object.class };

}
