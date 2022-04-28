package main.java.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();

    int val();
}

public class Meta {
    // Annotate a method
    @MyAnno(str = "Annotation Example", val = 100)
    public static void myMeth() {
        Meta ob = new Meta();

        // Obtain the annotation for this method
        // and display the values of the members
        try {
            // First, get a class object that represents this class.
            Class<?> c = ob.getClass();

            // Now get a Method object that represents this method
            Method m = c.getMethod("myMeth");

            // Next, get the annotation for this class
            MyAnno a = m.getAnnotation(MyAnno.class);

            System.out.println(a.str() + " " + a.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Method could not be found!");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
