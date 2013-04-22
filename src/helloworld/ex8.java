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
public class ex8 {
    ex8(){
        this("ss");
        print("ex-1");
    }
    ex8(String s){
        print(s+"ex8-2");
    }
    
    void f1(){
        print("f1");
    }
    void f2(){
        f1();
        this.f1();
    }
    
    public static void main(String... args){
        ex8 e1 = new ex8();
        e1.f2();
    }
}
