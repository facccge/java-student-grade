package com.tw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean flag = true;
        while(flag){
            Library.printMainInterface();
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if(choice==1){

            }else if(choice==2){

            }else if(choice==3){
                flag = false;
            }
        }
    }
}
