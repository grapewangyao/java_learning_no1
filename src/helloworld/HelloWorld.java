/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author wangyao_tp
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("\n==================\n");
        ATypeName a = new ATypeName();
        a.show();
        System.out.print("\n==================\n");
        DataOnly d = new DataOnly();
        d.setBoolean(true);
        d.setDouble(11.2);
        d.setInt(2);
        d.c();
        System.out.print("\n==================\n");
    }
}
