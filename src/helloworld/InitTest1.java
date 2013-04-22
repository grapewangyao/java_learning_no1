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
public class InitTest1 {
    InitTest1(){
        print("I'm here!");
    }
    
    InitTest1(String s){
        this();
        print(s);
    }
    
    public static void main(String[] args){
        InitTest1 t1 = new InitTest1("sss");
    }
}
