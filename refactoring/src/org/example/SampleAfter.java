package org.example;

public class SampleAfter {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        addAndPrint(a, b, "Sum1: ");
        minusAndPrint(a,b,"Difference1: ");

        int x = 15;
        int y = 7;

        addAndPrint(x,y,"sum2 :");
        minusAndPrint(x,y,"Diffrence2: ");
    }

    public static int addAndPrint(int a,int b,String message){
        int sum = a + b;
        System.out.println(message + sum);
        return sum;
    }

    public static int minusAndPrint(int a,int b, String messagi){
        int diff = a - b;
        System.out.println(messagi + diff);
        return diff;
    }
}
