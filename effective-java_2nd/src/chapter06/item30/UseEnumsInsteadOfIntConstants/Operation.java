/**
 * 
 */
package chapter06.item30.UseEnumsInsteadOfIntConstants;

import java.util.HashMap;
import java.util.Map;

/**
 * int�萔�̑����enum���g�p����<br>
 * �萔�ŗL�N���X�{�̂ƒ萔�ő̃f�[�^������enum�^
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

	// enum�^��fromString���\�b�h����������
	private static final Map<String, Operation> stringToEnum = new HashMap<>();
	static {	// �萔������enum�萔�ւ̃}�b�v��������
		for (Operation op : values())
			stringToEnum.put(op.toString(), op);
	}
	// ������ɑ΂���Operation��Ԃ��B�����񂪕s���Ȃ�null��Ԃ��B
	public static Operation fromString(String symbol) {
		return stringToEnum.get(symbol);
	}

	Operation(String symbol) { this.symbol = symbol; }

	// enum�^��toString���I�[�o�[���C�h����ꍇ�́AfromString���\�b�h����������
	@Override
	public String toString() { return symbol; }

	abstract double apply(double x, double y);

}