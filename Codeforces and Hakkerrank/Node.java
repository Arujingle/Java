/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */

    public class Node{
        private Node left;
        private Node right;
        private int key;
        
        
        public Node(int key){this.key = key;
        left = null;
        right=null;}
        
        public void setLeft(Node left){this.left=left;}
        public void setRight(Node right){this.right=right;}
        
        public Node getRight(){return right;}
        public Node getLeft(){return left;}
        public void setKey(int key){this.key=key;}
        public int getKey(){return key;}
        public void print(){System.out.println("Key is"+getKey());
        }
        
        
        
    }
