/**
 * 
 */
package chapter06.item30.UseEnumsInsteadOfIntConstants;

/**
 * int定数の代わりにenumを使用する
 * 
 * @author sinokuma
 *
 */
public class WeightTable {
	public static void main(String[] args) {
		double earthWeight = Double.parseDouble(args[0]);
		double mass = earthWeight / Planet.EARTH.surfaceGravity();
		for (Planet p : Planet.values())
			System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
	}

}
