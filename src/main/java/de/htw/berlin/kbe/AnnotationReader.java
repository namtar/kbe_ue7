package de.htw.berlin.kbe;

import de.htw.berlin.kbe.annotation.CreationInfo;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Class to read annotations from a class.
 * <p/>
 * <p/>
 * Created by drummer on 03.06.2015.
 */
public class AnnotationReader {

	public static String readAnnotationFromClass(Object object) {

		if (object != null) {

			Annotation[] annotations = object.getClass().getAnnotations();
			for (Annotation annotation : annotations) {
				Method[] annotationMethods = annotation.getClass().getDeclaredMethods();
				for (Method method : annotationMethods) {
					try {
						//						System.out.println(method.getName());
						Method[] superclassMethods = annotation.getClass().getSuperclass().getMethods();
						boolean contained = false;
						for (Method superClassMethod : superclassMethods) {
							if (superClassMethod.getName().equals(method.getName())) {
								contained = true;
								break;
							}
						}
						if (!contained) {
							Object result = method.invoke(annotation);
							if (result.getClass().isArray()) {
								for (Object elem : (Object[]) result) {
									System.out.println(elem);
								}
							} else {
								System.out.println(result);
							}

						}
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					}
				}
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
