/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import static net.mindview.util.Print.*;
class Tank{
    public float level;
}

/**
 *
 * @author wangyao_tp
 */
public class AliasTest {
    
     public static void f(Tank y){
        y.level = 5;
    }
    
    
    public  void main(String[] args){
        Tank t1 = new Tank();
        Tank t2 = new Tank(); 
        t1.level=2.5f;
        t2.level=3;
        print("t1:"+t1.level+" t2:"+t2.level);
        t1 = t2;
        print("t1:"+t1.level+" t2:"+t2.level);
        t1.level = 13;
        t2.level = 3.3f;
        print("t1:"+t1.level+" t2:"+t2.level);
        f(t1);
        print("t1----:"+t1.level+" t2:"+t2.level);
    }   
}