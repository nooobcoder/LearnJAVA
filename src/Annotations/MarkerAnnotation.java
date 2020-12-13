package Annotations;

/*
 * A marker annotation is a special kind of annotation that contains no members. It's sole purpose is to mark an item.
 * A marker annotation is just an interface with an empty body
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@interface MarkAnnotation {
}

public class MarkerAnnotation {

    // Annotate a method using annotation
    @MarkAnnotation()
    public static void myMeth() {
        MarkerAnnotation annotationObject = new MarkerAnnotation();

        try {
            Method mth = annotationObject.getClass().getMethod("myMeth");

            if (mth.isAnnotationPresent(MarkAnnotation.class)) {
                System.out.println("MarkerAnnotation is present");
            }
        } catch (NoSuchMethodException e) {
            System.out.println("No method found!");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
