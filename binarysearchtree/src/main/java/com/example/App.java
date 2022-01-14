package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "-Binary Search Tree-" );
        
        binarySearchTree arbol=new binarySearchTree();
        arbol.insert(8);
        arbol.insert(2);
        arbol.insert(3);
        arbol.insert(8);
      
        System.out.println("arbol:"+arbol);
    }
}
