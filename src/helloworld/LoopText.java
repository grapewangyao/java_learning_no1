/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.util.Random;
import static net.mindview.util.Print.*;
/**
 *
 * @author wangyao_tp
 */
public class LoopText {
    public void test1(){
        for(int i = 1; i<=100;i++){
           print(i+"\n");
        }
    }
    public void test2(){
        int temp = 0;
        int loop = 0;
        Random rand = new Random(5);
        for(int i = 1; i<=25;i++){
            loop = rand.nextInt(100);
            if(temp > loop){
                print("小："+loop);
            }else if(temp==loop){
                print("等："+loop);
            }else{
                print("大："+loop);
            }
            temp = loop;
        }
        
    }
    
    public void test3(){
        Random rand = new Random(5);
        for(int i =0;i<=5;i++){
            int max = rand.nextInt(500)+1;
            for(int j = 1; j <max;j++){
                int k = j%j;
                int k2 = 1%j;
                if((0==k)||(0==k2)){
                    print(j+"\n");
                }
            }
        }
    }
    
    public static void main(String[] arg){
        LoopText t1 = new LoopText();
        t1.test3();
    }
}
