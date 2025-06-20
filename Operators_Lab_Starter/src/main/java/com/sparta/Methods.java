package com.sparta;

public class Methods {
    public static void main(String[] args) {
        int stone = 6;
                int pounds = getWeightPound(stone);
        System.out.println(pounds);
        int pound = 80;
                int stoneresult =getWeightStone(pound);
        System.out.println(stoneresult);

    }

    public static int getWeightPound(int stone)    {
        int pounds = stone*14;
        return pounds;
    }
    public static int getWeightStone(int Pound)
    {
        int stone = (Pound/14);
        return stone;
    }

}
