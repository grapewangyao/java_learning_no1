/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author wangyao_tp
 */
public class DataOnly {
    int i;
    double d;
    boolean b;
    public void setInt(int newInt){
            i = newInt;
    }
    
    public void setDouble(double newDouble){
            d = newDouble;
    }
    
    public void setBoolean(boolean newBoolen){
            b = newBoolen;
    }
    
   public void c(){
            if(b){
                System.out.print(d);
            }else{
                System.out.print(i);
            }
   }
}
