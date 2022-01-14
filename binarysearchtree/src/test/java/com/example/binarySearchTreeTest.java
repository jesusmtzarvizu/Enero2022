package com.example;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class binarySearchTreeTest {

    @Test
    public void testDuplicated() {
      
        binarySearchTree arbol=new binarySearchTree();
        
        /*If number was added then expected result is true */
        assertThat(arbol.insert(1)).isEqualTo(true);
      
        /*If number was added then expected result is true */
        assertThat(arbol.insert(2)).isEqualTo(true);
      
        /*If number is duplicated then it´s not added then expected result is false */
         assertThat(arbol.insert(2)).isEqualTo(false);

    }

    @Test
    public void testContain() {
       
        binarySearchTree arbol=new binarySearchTree();
        arbol.insert(1);
        arbol.insert(2);
        arbol.insert(4);
        
         /*as the arbol contains the value then expected result is true */
        assertThat(arbol.contains(2)).isEqualTo(true);
        
         /*as the arbol doesn´t contain the value then expected result is false */
         assertThat(arbol.contains(3)).isEqualTo(false);
       
    }

    @Test
    public void testToString() {
       
        
        binarySearchTree arbol=new binarySearchTree();
        arbol.insert(8);
        arbol.insert(2);
        arbol.insert(1);
        arbol.insert(2);
        arbol.insert(3 );
        
         /*return String representation of the object */ 
        assertThat(arbol.toString()).isEqualTo("1238");
        
       


    }
    
    
}
