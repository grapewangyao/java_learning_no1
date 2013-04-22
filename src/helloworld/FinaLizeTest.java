/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author wangyao_tp
 */
public class FinaLizeTest {
    boolean c = false;
    void f(){
        c = true;
    }
    
    
    protected void finalize(){
        if(c){
            System.out.print("test!!");
        }
    }
    
    
    public static void main(String... args){
        FinaLizeTest f = new FinaLizeTest();
        f.f();
        System.runFinalizersOnExit(true);
        System.gc();
    }
}