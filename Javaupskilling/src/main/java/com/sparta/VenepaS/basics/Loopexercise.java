package com.sparta.VenepaS.basics;

public class Loopexercise {
    public static void main(String[] args) {
        int[] myArr = {1,2,3};
        int result = sumOfArray(myArr);
        System.out.println(result); // Output should be 6
    }
    public static int sumOfArray(int[] myArr){
        int sum = 0;
for(int i=0;i <myArr.length ;i++)
{
    sum = sum + myArr[i];
        // Write code so it returns the sum off all numbers in an array
        // Logic here - any loop you like!! Try them all out if you want

    }
        return sum;
}
}