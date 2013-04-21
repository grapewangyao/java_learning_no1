/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.util.*;
/**
 *
 * @author wangyao_tp
 */
public class Coins {
    public static void main(String[] arg){
        Random rand = new Random();
        int i = rand.nextInt(2);
        System.out.print(i);
        if(0== i){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
    }
}