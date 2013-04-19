/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author wangyao_tp
 */
public class TestStorge {
    String s;
    /** 111
    */
    public void setString(String newString){
           if(0 != newString.length()){
               s = newString;
           }
       }
       /** 222
    */
       public int storge(){
           return s.length() * 2;
       }
       
}
