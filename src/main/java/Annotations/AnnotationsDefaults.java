package main.java.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface AnnotationDefault {
    String str() default "Testing";

    int value() default 9000;
}

/*@AnnotationDefault() // both str and value defaults are used
@AnnotationDefault(str="Text Provided") // value defaults are used
@AnnotationDefault(value=12) // str defaults are used
@AnnotationDefault(str="Text Provided",value = 404) // no defaults are used*/

public class AnnotationsDefaults {
    // Annotate a method by using the default values
    @AnnotationDefault()
    public static void myMeth() {
        AnnotationsDefaults obj = new AnnotationsDefaults();
        try {
            Class<?> c = obj.getClass();
            Method m = c.getMethod("myMeth");
            AnnotationDefault annDef = m.getAnnotation(AnnotationDefault.class);

            System.out.println(annDef.str() + "  " + annDef.value());
        } catch (NoSuchMethodException e) {
            System.out.println("Method could not be found!");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
