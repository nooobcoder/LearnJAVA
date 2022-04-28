package main.java.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Sample {
    @Retention(RetentionPolicy.RUNTIME)
    @interface MyAnno {
        String str();

        int val();
    }
}
