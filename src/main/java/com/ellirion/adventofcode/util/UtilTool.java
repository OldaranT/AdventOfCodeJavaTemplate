package com.ellirion.adventofcode.util;

public class UtilTool {

    /**
     * A format helper to print the solutions.
     * @param className name of the class to print.
     * @param number if its solution 1 or 2.
     * @param solution the solution that you have made.
     */
    @SuppressWarnings("PMD")
    public static void printSolutionFormat(String className, String number, String solution) {
        System.out.println("                         " + className);
        System.out.println("====================== Solution " + number + " ======================");
        System.out.println(solution);
        System.out.println("========================== END ==========================");
        System.out.println();
    }
}
