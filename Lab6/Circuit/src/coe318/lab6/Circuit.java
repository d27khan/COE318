/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;
;

import java.util.ArrayList;

/**
 *
 * @author Daniel khan (500898010)
 */
public class Circuit {
    
        
        
        public ArrayList <Resistor> Resistors = new ArrayList <Resistor>();;

        public void add(Resistor r){
            
            this.Resistors.add(r);
            
        }
       
        
        @Override
        public String toString(){
            
            String AllResistors = "";
            
            
            for( int i=0;i< Resistors.size();i++){
                
                AllResistors += " " + Resistors.get(i) + "\n";
            }
            
            return AllResistors;
            
                    }
        
        
        private static Circuit instance = null;
        
        public static Circuit getInstance(){
            if (instance == null){
                instance = new  Circuit();
            }
                return instance;
        }
                    private Circuit(){} //Yes, the constructor is PRIVATE!
    
    
                    
                    
       public static void main(String[] args) {
            Circuit circuit = Circuit.getInstance();
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Resistor resistor = new Resistor (500, node1, node2);
        Resistor resistor1 = new Resistor(30, node2, node3);
        Resistor resistor2 = new Resistor(45,node1, node3);
        
        circuit.add(resistor);
        circuit.add(resistor1);
        circuit.add(resistor2);
        
        
        System.out.println(circuit);
           
    }
             
}
