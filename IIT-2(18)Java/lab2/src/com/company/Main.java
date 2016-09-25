package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tabulation tabulation = new Tabulation(-100.0,100.0,7.5, new MySin());
        tabulation.doIt();
        Point point = tabulation.getPreLastPoint();

        print(tabulation);

        print(point);

    }
    static void print(Point point){
        System.out.println(point);
    }

    static void print(Tabulation tabulation){
        System.out.println(tabulation);
    }
}
