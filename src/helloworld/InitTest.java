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
public class InitTest {
      String s;
      InitTest(){
      
      }

   
    
    InitTest(String s){
        this.s = s;
    }
    
    public static void main(String... arg){
        InitTest t1 = new InitTest("ssss");
        print(t1.s);
    }
}
