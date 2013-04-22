/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

class Aso {
	void bark() {System.out.println("woof");}
} 	

public class AutomaticConstructor {
	public static void main(String[] args) {
		Aso a = new Aso();
		a.bark();
	}
}