/**
 *
 */
package com.sinokuma.chapter06.item34.EmulateExtensibleEnumsWithInterfaces;

/**
 * 拡張可能なenumをインタフェースで模倣する<br>
 * 模倣された拡張enum
 *
 * @author sinokuma
 *
 */
public enum ExtendedOperation implements Operation {
    EXP("^") {
        public double apply(double x, double y) {
            return Math.pow(x, y);
        }
    },
    REMAINDER("%") {
        public double apply(double x, double y) {
            return x % y;
        }
    };

    private final String symbol;

    ExtendedOperation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
