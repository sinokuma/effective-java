/**
 *
 */
package chapter04.item19.useInterfacesOnlyToDefineTypes;

/**
 * 型を定義するためだけにインタフェースを使用する<br>
 * 定数インタフェースパターン - 使用してはいけない<br>
 * 実装の詳細をクラスの公開APIに漏洩してしまうため
 *
 * @author sinokuma
 *
 */
public interface PhysicalConstantsInterface {
    // アヴォガドロ数(1/mol)
    static final double AVOGADROS_NUMBER = 6.02214199e23;

    // ボルツマン定数(J/K)
    static final double BOLTZMANN_CONSTANT = 1.3806503e-23;

    // 電子の質量(kg)
    static final double ELECTRON_MASS = 9.10938188e-31;
}
