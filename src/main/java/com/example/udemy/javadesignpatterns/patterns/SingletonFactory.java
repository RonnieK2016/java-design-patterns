package com.example.udemy.javadesignpatterns.patterns;

public class SingletonFactory {

    public static Singleton getSingleton(String singletonType) {
        if("DOUBLE_CHECKED".equals(singletonType)) {
            return SingletonDoubleCheckedLock.getInstance();
        }
        else if("STATIC_INIT".equals(singletonType)) {
            return SingletonStaticInit.getInstance();
        }

        return null;
    }
}
