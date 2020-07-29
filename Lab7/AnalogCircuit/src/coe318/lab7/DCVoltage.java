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
public class DCVoltage {
    
    public double voltage;
    private Node node1;
    private Node node2;
    private int voltID;
    private static int voltcount = 1;
    
    public DCVoltage( double voltage, Node node1,Node node2){
        
        if (node1.NumNode > node2.NumNode && voltage > 0 || node1.NumNode < node2.NumNode && voltage < 0){
            
            this.node1 = node1;
            this.node2 = node2;
            this.voltage = voltage;
            this.voltID = voltcount;
            voltcount++;
            
        }
        else{
            throw new IllegalArgumentException("The polarity of the DC voltage source is invalid");  
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
            
            if(node1.NumNode < node2.NumNode){
            
                return("V"+ this.voltID + " " + this.node1 + "" + this.node2 + "DC" + "-" + this.voltage);
        } else
                return( "V"+ this.voltID + " " + this.node1 + "" + this.node2 + "DC" +  this.voltage);
        }
}
        
        

