package com.example.comp1011spring2025thursdays5pm;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Week3 {

    public static void main(String[] args) {
        example1();
        example2();
        example3();
        example4();
        FunInterface funInterface = new FunInterface() {
            @Override
            public int shout(String text) {
                return text.length();
            }
        };
        FunInterface funInterface1 = text -> text.length();
    }
    static void example1() {
        int sum = 0;

        for(int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    static void example2() {
      int sum = IntStream.rangeClosed(1, 10).sum();
      System.out.println(sum);
    }
    static void example3() {
        Stream.of("Ben", "John","Honey", "Jane", "Mary", "Jennifer", "Michael").filter(v -> v.length() > 3 && v.contains("o") ).forEach(System.out::println);
    }
    static void example4() {
        /*
        Ask user to enter superhero names separated by a comma output all names that have "man"
         */
        Console console = System.console();
        System.out.println("Enter super hero names separated by a comma");

       /* Arrays.asList(console.readLine()
                .split(","))
                .stream()
                .map(String::toLowerCase)
                .filter(v -> v.contains("man"))
                .map(String::trim)
                .forEach( s-> System.out.println(s));

        */
        List<String> favHeros = Arrays.asList(console.readLine()
                .split(","))
                .stream()
                .map(String::toLowerCase)
                .filter(v -> v.contains("man"))
                .map(String::trim)
                .toList();

        ArrayList<String> something = new ArrayList<>(favHeros);
    }
}

/*
Task 1
create a textfield in your gui with a submit button
add an event to this newly created submit button
search each cameramodel object and determine
if any of the string instance variables partially match (contains)
the valur of the user-inputted textfield value
if yes: output all cameramodel tostrings that match
if not: output: no matches

Steps
new method in your controller
1) get the search string text (lowercase, maybe?)
2) cbCameraList holds a List of items
turn this into a stream
3) filter to determiner if
            color contains search string value contains
         lens contains search string value contains
         color contains search string value contains
         model contains search string value contains

        4)using foreach: output to output Node
 */
