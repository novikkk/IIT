package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> data = new ArrayList<>();
        Random random = new Random();

        for(int i=0;i<10;i++){
            data.add(random.nextInt()%100);
        }

        Sequence sequence = new Sequence(data);

        System.out.println(sequence);

        System.out.println(sequence.getSum());

    }
}
