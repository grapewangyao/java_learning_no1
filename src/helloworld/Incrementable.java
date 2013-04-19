/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author wangyao_tp
 */
public class Incrementable {
    public static void increment(){
        StaticTest.staticI++;
    }
    public static void showStaticI(){
        System.out.print(StaticTest.staticI);
    }
}
