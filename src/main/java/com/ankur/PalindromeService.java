package com.ankur;

public class PalindromeService {

    public boolean isPalindrome(String input){
        return input.equalsIgnoreCase(new StringBuilder(input).reverse().toString());
    }

}
