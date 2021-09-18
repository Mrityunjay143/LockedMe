package com.lockedMe;

import java.util.Scanner;
public class HandleOptions {
    public static void Menu() {
        int No;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            try {
                WelComeClass.DisplayMenu();
                No = Integer.parseInt(sc.nextLine());
                String fileName = null;
                switch (No) {
                    case 1:
                        System.out.println("Please Enter Filename\n");
                        fileName = sc.nextLine();
                        FileOperations.createNewFile(fileName);
                        break;
                    case 2:
                        System.out.println("Enter the name of the file to be searched from \"Main\" folder");
                        fileName = sc.next();
                        FileOperations.displayFile(fileName, "Main");
                        break;
                    case 3:
                        System.out.println("Enter the name of the file to be deleted from \"Main\" folder");
                        fileName = sc.next();
                        FileOperations.deleteFile(fileName);
                        break;
                    case 4:
                    	sc.close();
                    	System.out.println("exit");
                        System.exit(0);
                        flag = false;
                       
                        break;
                    default:
                        System.out.println("Please give input between 1 to 4");
                }
            } catch (Exception ex) {
                System.out.println("Please give input in the form of integer");
                Menu();
            }
        }
    }
    public static void HomeMenuBusinessOperation() {
        FileOperations ob = new FileOperations();
        WelComeClass.HomeMenu();
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        while (run) {
            try {
                int no = sc.nextInt();
                switch (no) {
                    case 1:
                        System.out.println("Retriving file names In Ascending Order");
                        ob.RetrivingfilesInAscOrder();
                        HomeMenuBusinessOperation();
                        break;
                    case 2:
                        System.out.println("Business level operations");
                        Menu();
                        break;
                    case 3:
                        System.out.println("Option to close Application");
                        sc.close();
                        run = false;
                        System.exit(0);
                        break;
                    default:
                        System.out.println("please select valid input between 1 to 3");
                }
            } catch (Exception ex) {
                System.out.println("please give input in form of Integer");
                run = false;
                HomeMenuBusinessOperation();
            }

        }

    }
		
	}



