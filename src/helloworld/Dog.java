/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author wangyao_tp
 */
public class Dog {
    String name;
    String says;
    
    public static void main(String[] arg){
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.name = "kk";
        d1.says = "ww";
        d2.name = "jj";
        d2.says = "gg";
        Dog d3 = new Dog();
        d3 = d2;
        System.out.print(d1.equals(d2));
        System.out.print(d3.equals(d2));
    }
}