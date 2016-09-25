package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bogdan on 21.09.2016.
 */
public class Sequence {
    ArrayList<Integer> sequenceValue = new ArrayList<>();

    public Sequence(List<Integer> integers){
        sequenceValue.addAll(integers);
    }

    public Integer getSum(){
        int rez = 0;
        int min = getMin(sequenceValue);
        int max = getMax(sequenceValue);
        int firs_index, last_index;
        if(min<max){
            firs_index = min;
            last_index = max;
        }else{
            firs_index = max;
            last_index = min;
        }

        for (int i=firs_index+1;i<last_index;i++){
            rez+=sequenceValue.get(i);
        }
        return rez;
    }

    private int getMax(ArrayList<Integer> sequenceValue) {
        Integer max = sequenceValue.get(0);
        int pos = 0;
        for(int i=1;i<sequenceValue.size();i++){
            if(max>sequenceValue.get(i)){
                max = sequenceValue.get(i);
                pos = i;
            }
        }
        return pos;
    }

    private int getMin(ArrayList<Integer> sequenceValue) {
        Integer min = sequenceValue.get(0);
        int pos = 0;
        for(int i=1;i<sequenceValue.size();i++){
            if(min<sequenceValue.get(i)){
                min = sequenceValue.get(i);
                pos = i;
            }
        }
        return pos;
    }

    @Override
    public String
    toString() {
        return "Sequence{" +
                "sequenceValue=" + sequenceValue +
                '}';
    }
}
