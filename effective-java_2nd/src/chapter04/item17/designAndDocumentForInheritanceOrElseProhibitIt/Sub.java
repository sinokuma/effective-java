/**
 *
 */
package chapter04.item17.designAndDocumentForInheritanceOrElseProhibitIt;

import java.util.Date;

/**
 * 継承のために設計および文書化する、でなければ継承を禁止する
 *
 * @author sinokuma
 *
 */
public final class Sub extends Super {
    // コンストラクタにより設定されるブランクfinal
    private final Date date;

    Sub() {
        date = new Date();
    }

    // スーパークラスのコンストラクタから呼び出されるオーバーライドしているメソッド
    @Override
    public void overrideMe() {
        System.out.println(date);
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.overrideMe();
    }

}
