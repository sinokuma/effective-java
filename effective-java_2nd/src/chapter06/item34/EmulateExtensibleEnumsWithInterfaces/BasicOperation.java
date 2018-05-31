/**
 *
 */
package chapter06.item34.EmulateExtensibleEnumsWithInterfaces;

/**
 * 拡張可能なenumをインタフェースで模倣する<br>
 * インタフェースを使用して模倣された拡張可能なenum
 *
 * @author sinokuma
 *
 */
public enum BasicOperation implements Operation {
    PLUS("+") {
        public double apply(double x, double y) { return x + y; }
    },
    MINUS("-") {
        public double apply(double x, double y) { return x - y; }
    },
    TIMES("*") {
        public double apply(double x, double y) { return x * y; }
    },
    DIVIDE("/") {
        public double apply(double x, double y) { return x / y; }
    };

    private final String symbol;

    BasicOperation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
