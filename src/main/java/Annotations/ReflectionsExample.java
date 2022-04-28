package main.java.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnoReflect {
    String str();

    int val();
}

public class ReflectionsExample {
    @MyAnnoReflect(str = "Two Parameters", val = 19)
    public static void myMeth(String str, int i) {
        ReflectionsExample ob = new ReflectionsExample();
        try {
            Class<?> cObj = ob.getClass();

            Method meth = cObj.getMethod("myMeth", String.class, int.class);

            MyAnnoReflect annoReflect = meth.getAnnotation(MyAnnoReflect.class);

            System.out.println(annoReflect.str() + "  " + annoReflect.val());
        } catch (NoSuchMethodException e) {
            System.out.println("No method could be found!");
        }
    }

    public static void main(String[] args) {
        myMeth("test", 10);
    }
}