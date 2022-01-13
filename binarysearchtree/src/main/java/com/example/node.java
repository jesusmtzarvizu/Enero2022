package com.example;
import lombok.Data;

@Data
public class node {
    int value;
    node left;
    node right;

    
    node(int val){
        this.value=val;
    }
    
}
