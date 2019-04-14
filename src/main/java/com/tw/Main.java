package com.tw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        process();
    }

    public static void process() {
        boolean flag = true;
        Library library = new Library();
        while (flag) {
            library.printMainInterface();
            Scanner scanner = new Scanner(System.in);
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                continue;
            }
            if (choice == 1) {
                boolean addStudentFlag = true;
                library.printAddStudentInterface();
                while (addStudentFlag) {
                    String input = scanner.nextLine();
                    if (library.checkAddStudentInputFormat(input)) {
                        library.addStudent(input);
                        addStudentFlag = false;
                    } else {
                        library.printAddStudentFail();
                    }
                }
            } else if (choice == 2) {
                boolean generateTranscript = true;
                library.printGenerateTranscriptInterface();
                while (generateTranscript) {
                    String input = scanner.nextLine();
                    if (library.checkGenerateTranscriptInputFormat(input)) {
                        library.generateTranscript(input);
                        generateTranscript = false;
                    } else {
                        library.printGenerateTranscriptFail();
                    }
                }
            } else if (choice == 3) {
                flag = false;
            }
        }
    }
}
