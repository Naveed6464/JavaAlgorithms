package com.naveed.ds.demo.java8;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 23, 2020
 */
@FunctionalInterface
public interface FunctionalInterfaceDemo {

    public void firstWork();

//    public void secondWork();error
    default void work() {
        System.out.println("I am doing my work");
    }
}
