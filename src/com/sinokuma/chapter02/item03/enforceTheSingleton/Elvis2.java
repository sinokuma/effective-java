/**
 * 
 */
package com.sinokuma.chapter02.item03.enforceTheSingleton;

/**
 * enumシングルトン<br>
 * シングルトン実装の最善策は、単一要素のenum型を使う。<br>
 * 何もしなくとも、シリアライズ機構が提供される。
 * 
 * @author sinokuma
 *
 */
public enum Elvis2 {
    INSTANCE;

    public void leaveTheBuilding() {
        // ...
    }

}
