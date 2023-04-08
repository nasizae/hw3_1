package com.company;
import java.util.Arrays;
import java.util.Random;



public class Main {

    public static void main(String[] args) {
        //ДЗ:
        Random random = new Random();
        float[] numbers = new float[15];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextFloat(-15, 35);
        }
        System.out.print(Arrays.toString(numbers));

        boolean num1 = false;
        int count = 0;
        float sum = 0;
        for (double num : numbers) {
            if (num < 0) {
                num1 = true;
            }
            if (num1 == true && num > 0) {
                sum += num;
                count++;
            }
        }


        System.out.println("\nкол-во положительных чисел после отрицательных: " + count);
        System.out.println("Среднее арифметическое число: " + sum / count);
        //ДЗ на сообразительность
        boolean isSorted = false;
        float buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < numbers.length-1; i++) {
                if(numbers[i] > numbers[i+1]){
                    isSorted = false;

                    buf = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = buf;
                }
            }
            System.out.println(Arrays.toString(numbers));
        }
        }
    }


