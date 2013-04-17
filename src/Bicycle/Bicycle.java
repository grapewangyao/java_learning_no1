/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bicycle;

/**
 *
 * @author wangyao_tp
 */
public class Bicycle {
    private int cadence;
    private int speed;
    private int gear;
    
    public void changeCadence(int newCadence){
        this.cadence = newCadence;
    }
    
    void changeGear(int newValue) {
         this.gear = newValue;
    }
    
    void speedUp(int increment) {
         this.speed += increment;   
    }

    void applyBrakes(int decrement) {
         this.speed -= decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             this.cadence + " speed:" + 
             this.speed + " gear:" + this.gear);
    }
}
