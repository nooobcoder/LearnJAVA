package main.java.Annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnoMeta {
    String str();

    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

@What(description = "An annotation test class")
@MyAnnoMeta(str = "Meta2", val = 99)

public class Meta2 {
    @What(description = "An annotation test method")
    @MyAnnoMeta(str = "Testing", val = 100)
    public static void myMeth() {
        Meta2 obj = new Meta2();

        try {
            Annotation[] annos = obj.getClass().getAnnotations();

            // Display all annotations for '''Meta2'''
            System.out.println("All annotations for Meta2:");
            for (Annotation a : annos) {
                System.out.println(a);
            }
            System.out.println();

            // Display all annotations for MyMeth
            Annotation[] annos2 = obj.getClass().getMethod("myMeth").getAnnotations();
            System.out.println("All annotations for myMeth:");
            for (Annotation a : annos2) {
                System.out.println(a);
            }
            System.out.println();

        } catch (NoSuchMethodException e) {
            System.out.println("No method found!");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
