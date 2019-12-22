package com.cursor.funct;

public class FunctInterfaceExample {

    public static void main(String[] args) {

        SquareFoot squareFoot = number -> {

            if (number > 42) {
                return 2;
            } else {
                return 0;
            }
        };

        squareFoot.getSquareFoot(34);
    }
}
