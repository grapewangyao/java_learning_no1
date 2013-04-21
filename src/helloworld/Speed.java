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
public class Speed {

    
    double distance;
    double speedPerHour;
    double time;
    
    public void setDistance(double dis){
        distance = dis;
    }
    
    public void setSpeedPerHour(double speed){
        speedPerHour = speed;
    }
    
    public void setTime(double newTime){
        time = newTime;
    }
    
    public double getDistance(){
        return speedPerHour*time;
    }
    
    public static void main(String[] args){
            Speed temp = new Speed();
            temp.setSpeedPerHour(5);
            temp.setTime(20.5);
            double dis = temp.getDistance();
            print("dis: "+dis+"\n");
    }
}