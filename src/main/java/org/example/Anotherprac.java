package org.example;

import java.util.ArrayList;
import java.util.List;

public class Anotherprac {
    public static void main(String[] args) {
        /*int [] num = {1,2,4,5, 5, 6,7,8,6,3};
        List<Integer> matchyArray =  new ArrayList<>();
        boolean isMatching = false;
        for (int i = 0; i<num.length; i++){
            for (int j = i + 1; j< num.length; j++){
                System.out.println(num[i]+" ..........checking......... " +num[j]);
                if (num[i]==num[j]){
                    matchyArray.add(num[i]);
                    isMatching = true;
                }
            }
        }
        System.out.println("Any Matching No: " +isMatching);
        System.out.println("this is my matching no: " +matchyArray);*/
        /*double [] num = {1, 7, 0.6, 0.8, 1};
        boolean isSame = false;
        List<Double>sameNum = new ArrayList<>();
        for (int i = 0; i<num.length; i++){
            for (int j = i+1; j<num.length; j++){
                System.out.println(num[i]+ "........is checking......." +num[j]);
                if (num[i] == num[j]){
                    sameNum.add(num[i]);

                    isSame = true;

                }
            }
        }
        System.out.println("Any Matching Number: " +isSame );
        System.out.println(" Matching Number: " +sameNum);*/
        String [] car = {"volvo", "mazda", "kia", "volvo", "honda", "kia", "kia", "volvo"};
        boolean isDuplicate = false;
        List<String>syncCar = new ArrayList<>();
        for (int i = 0; i<car.length; i++){
            for (int j=i+1; j<car.length; j++ ){
                System.out.println("Algo checking...... " +car[i]+ ".......for........" +car[j]);
                if (car[i]==car[j]){
                    isDuplicate = true;
                    syncCar.add(car[j]);
                }
            }
        }
        System.out.println("Result: " +isDuplicate);
        System.out.println("Your sync search: " +syncCar);


    }
}
