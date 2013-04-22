/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import static net.mindview.util.Print.*;
/**
 *
 * @author wangyao_tp
 */
public class Dog2 {
  String bark(int s,String k){
       print("break1:"+s);
       return k;
   } 
   String bark(String k,int s){
       print("break2:"+s);
       return k;
   }
   
   public static void main(String... args){
       Dog2 d1 = new Dog2();
       d1.bark("kkkk", 2);
       d1.bark(3, "sssss");
       
   }
}
