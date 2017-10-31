package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {
  final Scanner input = new Scanner(System.in);
  printReverse(input);
 }
 
 private static void printReverse(final Scanner input) {
  // TODO recursively read and print successive input lines until EOF, then print them out in reverse order
 String str = input.nextLine();
 IStack stack = new LinkedStack<String>();
 
 if(!str.equals("EOF")){
     System.out.println(str);
     stack.push(str);
     printReverse(input);
 }
 
     for(int i = 0; i < stack.asList().size();i++){
         System.out.println(stack.pop());
     }


 }
     
    
}     
