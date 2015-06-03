package de.htw.berlin.kbe;

import de.htw.berlin.kbe.annotation.CreationInfo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Class to read annotations from a class.
 * <p/>
 * <p/>
 * Created by drummer on 03.06.2015.
 */
public class AnnotationReader {

	public static String readAnnotationFromClass(Object object, Class<? extends Annotation> annotationClass) {

		if (object != null) {

			Annotation annotation = object.getClass().getAnnotation(annotationClass);

			Method[] methods = annotationClass.getMethods();
			for (Method method : methods) {

			}
		}
		return null;
	}

	public static void readCreationInfo(Object object) {

		if (object != null) {

			CreationInfo creationInfo = object.getClass().getAnnotation(CreationInfo.class);
			if (creationInfo != null) {

				System.out.println("Author: " + creationInfo.author());
				System.out.println("Description: " + creationInfo.description());
				System.out.println("Tags: " + Arrays.toString(creationInfo.tags()));
			}

		}

	}

}
