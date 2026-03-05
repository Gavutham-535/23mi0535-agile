package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ReverseString{
    public String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
}