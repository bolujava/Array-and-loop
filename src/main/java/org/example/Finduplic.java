package org.example;

import java.util.ArrayList;
import java.util.List;

public class Finduplic {
    public static void main(String[] args) {
        boolean isDuplicate = false;
        int [] num = {7, 1, 7, 7, 6, 2, 3, 6, 6, 7};
        List<Integer>duplicateArray = new ArrayList<>();


        for (int i = 0; i<num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                System.out.println("current number: " +num[i]+"..........." + "checking number " +num[j]);
                if (num[i]==num[j]){
                    duplicateArray.add(num[i]);

                    isDuplicate = true;

                }


            }


        }

        System.out.println("DUPLICATED: " +isDuplicate);
        System.out.println("DUPLICATED NUMBERS: "+duplicateArray);
    }

}
