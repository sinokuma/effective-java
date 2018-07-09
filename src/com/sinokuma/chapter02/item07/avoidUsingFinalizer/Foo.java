/**
 * 
 */
package com.sinokuma.chapter02.item07.avoidUsingFinalizer;

/**
 * ファイナライザを避ける
 * 
 * @author sinokuma
 *
 */
public class Foo {

    /**
     * ファイナライザ連鎖は自動的には実行されない。<br>
     * そのため、明示的に呼び出すことが重要。
     */
    @Override
    protected void finalize() throws Throwable {
        try {
            // サブクラスのファイナライズ処理
        } finally {
            // サブクラス開発者が実装しなかったら、スーパークラスのファイナライザは呼び出されない
            super.finalize();
        }
    }

    /**
     * ファイナライザガーディアン<br>
     * Fooインスタンスが破棄されるタイミングでfinalizerGuardianオブジェクトも破棄され、<br>
     * 必ずfinalizerGuardian.finalize()が実行される。
     * 
     */
    @SuppressWarnings("unused")
    private final Object finalizerGuardian = new Object() {
        @Override
        protected void finalize() throws Throwable {
            // 外側のFooオブジェクトをファイナライズする
        }
    };



}
