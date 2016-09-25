package com.company;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Bohdan Novosad on 21.09.2016.
 */
public class Tabulation {
    private double a,b,h;
    private int k = 0;
    private Function function;
    private ArrayList<Point> data = new ArrayList<>();

    public Tabulation(double a, double b, double h, Function function){
        this.a=a;
        this.b=b;
        this.h=h;
        this.function = function;
        this.k = (int) (((b-a)/h)+1);
    }

    public void doIt(){
        int i=0;
        for(double a = this.a;a<this.b;a+=h){
            Point point = new Point(a, function.compute(a));
            data.add(point);
            System.out.println(point);
        }
    }

    public Point getPreLastPoint(){
        int lich = 0;
        int pos = -1;
        for(int i=data.size()-1;i>=0;i--){

            if(data.get(i).getY()>0)
                lich++;
            if(lich == 2)
                pos = i;
            if(lich==2)
                break;
        }

        if(pos==-1){
            return  null;
        }else {
            return data.get(pos);
        }
    }

    @Override
    public String toString() {
        return "Tabulation{" +
                "data=" + data +
                '}';
    }
}
