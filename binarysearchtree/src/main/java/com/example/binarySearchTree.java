package com.example;

public class binarySearchTree implements tree{

    node root=null;
    StringBuilder treeSequence= new StringBuilder();

    public boolean insert(int newData) {

        boolean containValue=false;
         containValue=contain(newData);
        if(containValue){
           return false;
        }else {
             add(newData);
            return true;
        }
        
    }
    @Override
    public void add(int key) {
            
            node n=new node(key);
            if(root==null) {
                root = n;
                return;
            }
            node prev=null;
            node temp=root;
            while (temp!=null){
                if(temp.value>key){
                    prev=temp;
                    temp=temp.left;
                }
                else if (temp.value<key){
                    prev=temp;
                    temp=temp.right;
                }
            }
            if(prev.value>key)
                prev.left=n;
            else prev.right=n;
        }


    public boolean contain(int value){
            return search(value);
    }
  
    @Override
    public boolean search(int value) {
        return search(root, value);
    }
    
    private boolean search(node n, int value) {
        if (n == null) { 
            return false;
        } else if (n.value == value) {
            return true;
        } else if (n.value > value) {
            return search(n.left, value);
        }else  return search(n.right, value);
    }
    @Override
    public String toString(){
        generate_sequence();
        return treeSequence.toString();

    }


   //Print
    public void generate_sequence() {
        preorder(root);
    }

     public void preorder(node n) {
        if (n == null) {
            return;
        }
        
        preorder(n.left);
        treeSequence.append(Integer.toString(n.value));
        preorder(n.right);

    }
   
}
