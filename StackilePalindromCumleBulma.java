
package com.mycompany.stackilepalindromcumlebulma;

import java.util.Scanner;
import java.util.Stack;

public class StackilePalindromCumleBulma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir cumle giriniz :");
        String cumle = scanner.nextLine();
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < cumle.length(); i++) {
            stack.push(cumle.charAt(i));
        }
        
        if(isPalindrome(cumle, stack)){
            System.out.println(cumle + " palindromik bir cumle");
        }
        else{
            System.out.println(cumle + " palindromik bir cumle degil");
        }
    }
    
    public static Boolean isPalindrome(String cumle,Stack<Character> stack){
        
        for (int i = 0; i < cumle.length(); i++) {
            if(stack.empty()){
                break;
            }
            else if(cumle.charAt(i) != stack.pop()){
                return false;
            }
        }
        return true;
    }
}
