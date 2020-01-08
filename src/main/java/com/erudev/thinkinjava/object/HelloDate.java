package com.erudev.thinkinjava.object;

import java.util.Date;

/** The first Thinking in Java example program.
 * displays a string and today's date.
 * @author erudev
 * @version java 1.8
 */
public class HelloDate {
    /** Entry point to class & application
     * @param args array of string arguments
     * @throws exceptions No exceptions thrown
     */
    public static void main(String[] args) {
        System.out.println("Hello it's:");
        System.out.println(new Date());
    }
}/* Output (55% match)
Hello it's:
Wed Jan 08 20:51:00 CST 2020
*/
