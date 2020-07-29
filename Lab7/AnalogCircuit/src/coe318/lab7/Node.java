/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 *
 * @author daniel
 */
public class Node{
    
    public int NumNode;
    static public int CountNode=0;
    
    public Node(){
        this.NumNode = CountNode;
        CountNode++;
        
    }
     
    @Override
    public String toString(){
        return (""+this.NumNode);
        
    }
    
    
    
}