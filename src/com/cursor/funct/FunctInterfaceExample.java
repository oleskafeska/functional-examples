package com.cursor.funct;

public class FunctInterfaceExample {

    public static void main(String[] args) {

        SquareFoot squareFoot = Math::sqrt;

        squareFoot.getSquareFoot(34);
    }
}
