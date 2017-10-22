/**
 *
 */
package chapter03.item12.considerImplementingComparable;

/**
 * Comparableの実装を検討する。<br>
 * 意味のあるフィールドから比較する。
 *
 * @author sinokuma
 *
 */
public final class PhoneNumber implements Cloneable, Comparable<PhoneNumber> {
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
     * Cloneableを実装するだけでなく、<br>
     * Object.clone()メソッドに対するpublicアクセスを提供する。
     */
    @Override
    public PhoneNumber clone() {
        try {
            // 共変戻り値により、オーバライドされたメソッドのサブタイプが戻り値であることが保証される。
            // ライブラリで対応可能な作業はクライアントに決してさせない。だから、キャストして返却する。
            return (PhoneNumber) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }

    }

    /**
     * int areaCodeDiff = areaCode - pn.areaCode;<br>
     * if (areaCodeDiff != 0)<br>
     *     return areaCodeDiff;    のように記載して、コードの単純化・効率化を図ることも可能。<br>
     * <br>
     * ただし、比較対象のフィールドの最大値と最小値の差がInteger.MAX_VALUE(2^31 - 1)以下である場合のみ。<br>
     * （そうでない場合、オーバーフローしてしまう可能性があるため。）
     */
    @Override
    public int compareTo(PhoneNumber pn) {
        //市外局番比較
        if (areaCode < pn.areaCode)
            return -1;
        if (areaCode > pn.areaCode)
            return 1;

        // 市外局番は等しい。市内局番前半比較。
        if (prefix < pn.prefix)
            return -1;
        if (prefix > pn.prefix)
            return 1;

        // 市外局番、市内局番前半は等しい。市内局番後半比較。
        if (lineNumber < pn.lineNumber)
            return -1;
        if (lineNumber > pn.lineNumber)
            return 1;

        // 全フィールドが等しい。
        return 0;
    }
}
