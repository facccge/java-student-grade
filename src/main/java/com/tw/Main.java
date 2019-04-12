package com.tw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean flag = true;
        Library library = new Library();
        while(flag){
            library.printMainInterface();
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            if(choice==1){
                library.addStudent();
            }else if(choice==2){

            }else if(choice==3){
                flag = false;
            }
        }
    }
}
