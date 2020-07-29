/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class UserMain implements UICircuit{
    String x = "";
    ArrayList< Object > CircuitComp = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    
    public void start(){
        display();
        run();
        
    }
    
    public void run(){
        while(true){
            x = input.nextLine().trim();
            if(x.equalsIgnoreCase("end")){
                end();
                break;
            } else if(x.equalsIgnoreCase("spice")){
                spice();
                
            }else{
                String[] value = x.split(" ");
                if(value.length != 4){
                    System.out.println("input error, please try again.");
                }else{
                    if(x.toLowerCase().startsWith("v")){
                        double y;
                        Node node01 = new Node();
                        Node node02 = new Node();
                        node01.NumNode = Integer.parseInt(value[1]);
                        node02.NumNode = Integer.parseInt(value[2]);
                        y = Double.parseDouble(value[3]);
                        DCVoltage volt = new DCVoltage(y,node01,node02);
                        CircuitComp.add(volt);
                    }else if(x.toLowerCase().startsWith("r")){
                        double y;
                        Node node01 = new Node();
                        Node node02 = new Node();
                        node01.NumNode = Integer.parseInt(value[1]);
                        node02.NumNode = Integer.parseInt(value[2]);
                        y = Double.parseDouble(value[3]);
                        Resistor resis = new Resistor(y,node01,node02);
                        CircuitComp.add(resis);
                    }
                 
            }
    }
    }
}

    @Override
    public void display()
    {
        System.out.println("Enter input:");
    }
    
    @Override
   public void spice()
   {
       for(Object cir : CircuitComp)
       {
           System.out.println(cir);
       }
    }

    @Override
    public void end()
   {
       System.out.println("All done");
   }
   
   public static void main(String[] args)
   {
       UserMain main = new UserMain();
       main.start();
   }














}




