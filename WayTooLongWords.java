package com.codeforces;
import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args){
        int count;
        String word;
        Scanner in=new Scanner(System.in);
        count=in.nextInt();
        for(int i=0;i<count+1;i++){
            word=in.nextLine();
            if(word.length()<=10){
                System.out.println(word);
            }else{
                System.out.print(word.charAt(0));
                System.out.print(word.length()-2);
                System.out.println(word.charAt(word.length()-1));
            }
        }
    }
}
