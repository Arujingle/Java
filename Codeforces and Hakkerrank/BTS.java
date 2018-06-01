/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */






public class BTS {
    Node root;
    Node parIns = root;
          Node insNode = root;
    
    public BTS(){root=null;}
    
    
    public Node getRoot(){return root;}
    
    public Node find(int key) { 
        
        Node insNode = root; 
     while(insNode.getKey() != key) 
     {
      if(key < insNode.getKey()) 
      insNode  = insNode.getLeft();
       else 
       insNode = insNode.getRight();
        if(insNode == null) 
        return null; 
}
        return insNode; 
} 
   
public void insert(int key){
      Node n1 = new Node(key);
      
      if(root==null){root =n1;}
      else{
          
          Node parIns = root;
          Node insNode = root;
          
          while(insNode!=null){
              parIns = insNode;
              
              if(key < insNode.getKey()){
                  insNode = insNode.getLeft();
              }
              else{
                  insNode = insNode.getRight();
                    }//search is over
            
          }
          if(key<parIns.getKey()){
              parIns.setLeft(n1);//insert on the left
          }
          else
              parIns.setRight(n1);//insert to the left
              
              
          }
      }
           public void printInorder(Node n){
          if(n!=null){
        printInorder(n.getLeft());
        n.print();
        printInorder(n.getRight());
    }
}



}


