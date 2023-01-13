package ru.hse.mavendemo88888;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws
            ClassNotFoundException,
            NoSuchMethodException,
            InvocationTargetException,
            InstantiationException,
            IllegalAccessException {
        Class<?> clazz = Class.forName("ru.hse.mavendemo88888.Demo");
        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor();
        Object o = declaredConstructor.newInstance();
        System.out.println(o);

        Method method = clazz.getDeclaredMethod("run");
        Object invoke = method.invoke(o);
        System.out.println(invoke);
    }

    public void run() {
        System.out.println("Hello");
    }
}
