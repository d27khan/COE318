/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;
;

import java.util.ArrayList;

/**
 *
 * @author Daniel khan (500898010)
 */
public class Circuit {
    
        
        
        public ArrayList <Resistor> Resistors = new ArrayList <Resistor>();
        public ArrayList<DCVoltage> vs = new ArrayList<DCVoltage>();

        public void add(Resistor r){
            
            this.Resistors.add(r);
            
        }
       
        
       public void addresistor(Resistor r){
           Resistors.add(r);
           
       }
       public void addvoltage(DCVoltage v){
           vs.add(v);
           
       }
      
        private static Circuit instance = null;
        
        public static Circuit getInstance(){
            if (instance == null){
                instance = new  Circuit();
            }
                return instance;
        }
                    private Circuit(){} //Yes, the constructor is PRIVATE!
    
    @Override
        public String toString(){
            
            String AllResistors = "";
            String Allvolts = "";
            int i = 0;
            
            while(i < vs.size() || i< Resistors.size()){
                
              if(i < vs.size()){
                  Allvolts += vs.get(i);
                  
              }
              if(i< Resistors.size()){
                  AllResistors += Resistors.get(i);
                  
              }
              i++;
            }
            return AllResistors+Allvolts;
        }
            
            
                    
                    
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
