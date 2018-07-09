/**
 *
 */
package com.sinokuma.chapter06.item34.EmulateExtensibleEnumsWithInterfaces;

/**
 * 拡張可能なenumをインタフェースで模倣する
 *
 * @author sinokuma
 *
 */
public class Sample {

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        // クラスリテラルは境界型トークンとしての機能を果たす
        test(ExtendedOperation.class, x, y);
    }

    private static <T extends Enum<T> & Operation> void test(Class<T> opSet, double x, double y) {
        for (Operation op : opSet.getEnumConstants())
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
    }
}
