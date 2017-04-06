package com.hacker.earth;

import java.util.*;
class A
{
    int add(int i, int j)////Line 3
    {
        return i+j;
    }
}
public class TestClass
{
    public static void main(String [] args)
    {
        int x= 0;
        int y= 0;
        for (int z = 0; z < 5; z++)
        {
            if ((x++ > 2 ) && (++y > 2))
            {
                x++;
            }
        }
        System.out.println(x + " " + y);
    }
}