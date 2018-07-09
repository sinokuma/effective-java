/**
 *
 */
package com.sinokuma.chapter03.item09.alwaysOverrideHashCodeWhenOverridingEquals;

/**
 * toStringを常にオーバーライドする
 *
 * @author sinokuma
 *
 */
public final class PhoneNumber {
    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        rangeCheck(areaCode, 999, "area code");
        rangeCheck(prefix, 999, "prefix");
        rangeCheck(lineNumber, 999, "line number");
        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }

    private static void rangeCheck(int arg, int max, String name) {
        if (arg < 0 || arg > max)
            throw new IllegalArgumentException(name + ": " + arg);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if(!(o instanceof PhoneNumber))
            return false;
        PhoneNumber pn = (PhoneNumber) o;
        return pn.lineNumber == lineNumber
                && pn.prefix == prefix
                && pn.areaCode == areaCode;
    }

    // 不完全 - hashCodeメソッドがない
    // HashMapで使用された場合どうなるか:getはnullになる
    // Map<PhoneNumber, String> m = new HashMap<>();
    // m.put(new PhoneNumber(707, 867, 5309), "Jenny");
    // m.get(new PhoneNumber(707, 867, 5309))
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + areaCode;
        result = 31 * result + prefix;
        result = 31 * result + lineNumber;
        return result;
    }


    /**
     * 明示する/しないに関わらず、意図を明確に記載する。<br>
     * toStringで返される値に含まれる情報は全てアクセッサを提供すること。<br>
     * 提供しないと文字列がAPIとなり、パフォーマンス低下や変更に弱いプログラムになってしまう。
     *
     */
    @Override
    public String toString() {
        return String.format("(%03d) %03d-%04d", areaCode, prefix, lineNumber);
    }

}
