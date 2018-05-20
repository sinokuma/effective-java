/**
 *
 */
package chapter06.item31.UseInstanceFieldsInsteadOfOrdinals;

/**
 * 序数の代わりにインスタンスフィールドを使用する<br>
 * 関連付けられた値を導き出すためにordinalを乱用
 *
 * @author sinokuma
 *
 */
public enum Ensemble {
    SOLO, DUET, TRIO, QUARTET, QUINTET,
    SEXTET, SEPTET, OCTET, NONET, DECTET;
    public int numberOfMusicians() {
        return ordinal() + 1;
    }
}
