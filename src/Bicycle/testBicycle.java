/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bicycle;
/**
 *
 * @author wangyao_tp
 */
public class testBicycle {
        public static void main(String[] arg){
            Bicycle testObj = new Bicycle();
            testObj.changeCadence(1);
            testObj.changeGear(2);
            testObj.speedUp(3);
            testObj.printStates();
        }
}