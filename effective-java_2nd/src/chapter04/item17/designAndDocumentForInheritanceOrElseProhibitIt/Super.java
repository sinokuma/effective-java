/**
 *
 */
package chapter04.item17.designAndDocumentForInheritanceOrElseProhibitIt;

/**
 * 継承のために設計および文書化する、でなければ継承を禁止する
 *
 * @author sinokuma
 *
 */
public class Super {

    // 不完全 - コンストラクタがオーバーライド可能なメソッドを呼び出している
    public Super() {
        overrideMe();
    }

    public void overrideMe() {

    }

}
