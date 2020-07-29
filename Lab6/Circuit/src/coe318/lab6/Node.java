
package coe318.lab6;
/**
 *
 * @author Daniel Khan (500898010)
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
