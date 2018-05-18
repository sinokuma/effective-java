/**
 * 
 */
package chapter06.item30.UseEnumsInsteadOfIntConstants;

import java.util.HashMap;
import java.util.Map;

/**
 * int定数の代わりにenumを使用する<br>
 * 定数固有クラス本体と定数固体データを持つenum型
 * 
 * @author sinokuma
 *
 */
public enum Operation {
	PLUS("+") {
		double apply(double x, double y) { return x + y; }
	},
	MINUS("-") {
		double apply(double x, double y) { return x - y; }
	},
	TIMES("*") {
		double apply(double x, double y) { return x * y; }
	},
	DIVIDE("/") {
		double apply(double x, double y) { return x / y; }
	};

	private final String symbol;

	// enum型にfromStringメソッドを実装する
	private static final Map<String, Operation> stringToEnum = new HashMap<>();
	static {	// 定数名からenum定数へのマップを初期化
		for (Operation op : values())
			stringToEnum.put(op.toString(), op);
	}
	// 文字列に対するOperationを返す。文字列が不正ならnullを返す。
	public static Operation fromString(String symbol) {
		return stringToEnum.get(symbol);
	}

	Operation(String symbol) { this.symbol = symbol; }

	// enum型でtoStringをオーバーライドする場合は、fromStringメソッドを検討する
	@Override
	public String toString() { return symbol; }

	abstract double apply(double x, double y);

}