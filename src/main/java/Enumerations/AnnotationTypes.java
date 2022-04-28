package main.java.Enumerations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
@interface TypeAnno {
}

@Target(ElementType.TYPE_USE)
@interface NotZeroLen {
}

@Target(ElementType.TYPE_USE)
@interface Unique {
}

@Target(ElementType.TYPE_USE)
@interface MaxLen {
    int value() default 0;
}

@Target(ElementType.TYPE_PARAMETER)
@interface What {
    String description() default "";
}

@Target(ElementType.FIELD)
@interface EmptyOK {
}

@Target(ElementType.METHOD)
@interface Recommended {
}

public class AnnotationTypes<@What(description = "Generic Data Type") T> {
    // Use a type annotation on a constructor
    public @Unique AnnotationTypes() {
    }

    // Annotate the type (in this case string), not the field
    @TypeAnno String str;

    // This annotates the field test.
    @EmptyOK
    String test;

    // Use a type annotation to annotate this
    public int f(@TypeAnno AnnotationTypes<T>this, int x) {
        return 10;
    }

    // Annotate the return type
    public @TypeAnno Integer f2(int j, int k) {
        return j + k;
    }

    // Annotate the method declaration
    public @Recommended
    Integer f3(String s3) {
        return s3.length() / 2;
    }

    // Use a type annotation with a throws clause
    public void f4() throws @TypeAnno NullPointerException {
        // ...
    }

    // Annotate array levels
    String @MaxLen(10) [] @NotZeroLen [] w;

    // Annotate the array element type.
    @TypeAnno Integer[] vec;

    public static void myMeth(int i) {
        AnnotationTypes<@TypeAnno Integer> ob = new AnnotationTypes<@TypeAnno Integer>();
        @Unique AnnotationTypes<Integer> ob2 = new @Unique AnnotationTypes<Integer>();

        Object x = Integer.valueOf(10);
        Integer y;

        y = (@TypeAnno Integer) x;
    }

    public static void main(String[] args) {
        myMeth(10);
    }

    class SomeClass extends @TypeAnno AnnotationTypes<Boolean> {
    }
}
