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
public class Resistor {
      
      public double resistance;
      private Node node1;
      private Node node2;
      private int ResisID;
      private static int CountResistance = 1;
    
    public Resistor(double resistance, Node node1, Node node2){
        
        if(resistance < 0){
            throw new IllegalArgumentException("Resistor Vaue cannot be negative");}
        else if(node1 == null || node2 == null){
            throw new IllegalArgumentException("A node cannot be null");}
        else{
            this.resistance = resistance;
            this.node1 = node1;
            this.node2 = node2;
            this.ResisID = CountResistance;
            CountResistance++;
        }
    }

    public Node [] getNodes(){
        Node [] ArrayofNodes = new Node[2];
        ArrayofNodes[0]=node1;
        ArrayofNodes[1]=node2;
        
        return ArrayofNodes;
        
    }
    
    @Override
    public String toString(){
        
        return ("R" + this.ResisID + " " + this.node1 + " " + this.node2+ " " + this.resistance);
    }
    
    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        
        
        
        Resistor resistor = new Resistor(30,node1,node2);
        Resistor resistor1 = new Resistor(1000,node3,node4);
        
        System.out.println(resistor);
        System.out.println(resistor1);
    }
}
