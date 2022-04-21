package com.company;

import java.util.regex.*;
import java.util.Scanner;

public class regex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter regex pattern: ");
            Pattern p = Pattern.compile(sc.nextLine());
            System.out.println("Enter text: ");
            Matcher m = p.matcher(sc.nextLine());
            boolean found = false;
            while(m.find()){
                System.out.println("I found the text " + m.group() + " starting index at " + m.start() +
                        " and ending index at " + m.end());
                found = true;
            }
            if(!found){
                System.out.println("No match found");
            }
        }
    }

}
