/**
 *
 */
package com.sinokuma.chapter04.item19.useInterfacesOnlyToDefineTypes;

/**
 * 型を定義するためだけにインタフェースを使用する<br>
 * 定数ユーティリティクラス
 *
 * @author sinokuma
 *
 */
public class PhysicalConstantsClass {

    private PhysicalConstantsClass() {
        // インスタンス化を防ぐ
    }

    public static final double AVOGADROS_NUMBER = 6.02214199e23;
    public static final double BOLTZMANN_CONSTANT = 1.3806503e-23;
    public static final double ELECTRON_MASS = 9.10938188e-31;
}
