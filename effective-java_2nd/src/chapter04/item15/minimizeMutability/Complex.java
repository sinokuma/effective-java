/**
 *
 */
package chapter04.item15.minimizeMutability;

/**
 * 可変性を最小限にする<br>
 * 1. オブジェクトの状態を変更するためのいかなるメソッドも提供しない。<br>
 * 2. クラスが拡張できないことを保証する。<br>
 * 3. 全てのフィールドをfinalにする。<br>
 * 4. 全てのフィールドをprivateにする。<br>
 * 5. 可変コンポーネントに対する独占的アクセスを保証する。
 *
 * @author sinokuma
 *
 */
public class Complex {
    private final double re;
    private final double im;

    // コンストラクタの代わりにstaticファクトリーメソッドを持つ不変クラス
    private Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static Complex valueOf(double re, double im) {
        return new Complex(re, im);
    }

    // 対応するミューテータを持たないアクセッサ
    public double readPart() {
        return re;
    }
    public double imaginaryPart() {
        return im;
    }

    public Complex add(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }

    public Complex subtract(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }

    public Complex multiply(Complex c) {
        return new Complex(re * c.re - im * c.im, re * c.re + im * c.im);
    }

    public Complex divide(Complex c) {
        double tmp = re * c.re + im * c.im;
        return new Complex((re * c.re + im * c.im) / tmp, (re * c.re - im * c.im) / tmp);
    }

    /* (非 Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Complex))
            return false;

        Complex other = (Complex) obj;
        // ==の代わりにcompareを使用する（p42参照）
        return Double.compare(re, other.re) == 0 && Double.compare(im, other.im) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17 + hashDouble(re);
        result = 31 * result + hashDouble(im);
        return result;
    }

    private static int hashDouble(double val) {
        long longBits = Double.doubleToLongBits(val);
        return (int) (longBits ^ (longBits >>> 32));
    }

    @Override
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }

}
