/**
 *
 */
package chapter04.item19.useInterfacesOnlyToDefineTypes;

import static chapter04.item19.useInterfacesOnlyToDefineTypes.PhysicalConstantsClass.*;

/**
 * 型を定義するためだけにインタフェースを使用する<br>
 * 定数の修飾を回避する場合はstaticインポート<br>
 *
 * @author sinokuma
 *
 */
public class Test {
    double atoms(double mols) {
        // return PhysicalConstantsClass.AVOGADROS_NUMBER * mols;
        return AVOGADROS_NUMBER * mols;
    }
}
