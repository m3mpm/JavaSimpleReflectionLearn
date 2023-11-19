package com.learn;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {

        // Part 1
        Person person = new Person();

        Class personClass1 = Person.class;
        Class personClass2 = person.getClass();
        Class personClass3 = Class.forName("com.learn.Person");

        System.out.println(" ***** All methods of com.learn.Person Class *****");
        Method[] methods = personClass1.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + ", " + method.getReturnType() +
                    ", " + Arrays.toString(method.getParameterTypes()));
        }

        System.out.println(" ***** Fields of com.learn.Person Class *****");
        Field[] fields = personClass1.getDeclaredFields();
        for (Field field: fields) {
            System.out.println(field.getName() + ", " + field.getType());
        }

        System.out.println(" ***** Annotation of com.learn.Person Class *****");
        Annotation[] annotations = personClass1.getAnnotations();
        for (Annotation annotaton: annotations) {
            if(annotaton instanceof Author)
                System.out.println("This class has Author annotation");
        }

//        // Part 2
//        // Class_name_1 Class_name_2 Method_name
//        Scanner scanner = new Scanner(System.in);
//        Class classObject1 = Class.forName(scanner.next()); //Object of class with name: Class_name_1
//        Class classObject2 = Class.forName(scanner.next()); //Object of class with name Class_name_2
//        String methodName = scanner.next(); //Method_name
//
//        Method m = classObject1.getMethod(methodName,classObject2);
//        Object o1 = classObject1.newInstance();
//        Object o2 = classObject2.getConstructor(String.class).newInstance("String value");
//
//        m.invoke(o1,o2);
//
//        System.out.println(o1);
    }
}
