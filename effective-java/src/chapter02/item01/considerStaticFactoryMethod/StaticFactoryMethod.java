/**
 * 
 */
package chapter02.item01.considerStaticFactoryMethod;

/**
 * コンストラクタの代わりにstaticファクトリーメソッドを検討する
 * 
 * @author sinokuma
 *
 */
public class StaticFactoryMethod {

    /**
     * staticファクトリーメソッド例
     * boolean基本データ値をBooleanオブジェクト参照に変換
     */
    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}
