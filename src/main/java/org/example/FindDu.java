package org.example;

public class FindDu {
    public static void main(String[] args) {
        String [][] name= {{"Ade", "Kenny", "Love", "Janet"}, {"Joy", "Luke", "Franca"}};
        int x = 0;
        int y=0;
        for (String [] beau : name ){
            while(x<beau.length){
                while(y<beau[x].length()){
                    System.out.println(beau[y]);
                    y++;



                    
                }
                System.out.println(beau[x]);
                x++;


            }
        }


    }
}
