package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    //count telex from input
    static String countVN(String input) {
        int count = 0;
        String[] telexList={"aw","aa","dd","ee","oo","ow","w"};
        List<String> telexAppear = new ArrayList<>();
        for (String s : telexList) {
            String[] parts = input.split(s);
            count += parts.length - 1;
            if(input.contains(s))
            {
                telexAppear.add(s);
            }
        }
        return count+telexAppear.toString().replace("[","(").replace("]",")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = countVN(input);
        System.out.println(output);
    }
}

