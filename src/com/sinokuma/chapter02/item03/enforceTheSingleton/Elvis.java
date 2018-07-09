/**
 * 
 */
package com.sinokuma.chapter02.item03.enforceTheSingleton;

/**
 * privateコンストラクタかenum型でシングルトン特性を強制する
 * 
 * @author sinokuma
 *
 */
public class Elvis {

    // 1. public finalのフィールドによるシングルトン
    public static final Elvis INSTANCE = new Elvis();

    /**
     * privateコンストラクタ
     */
    private Elvis() {
        // ただし、特権クライアントはAccessibleObject.setAccesibleを使用して
        // リフレクションによりprivateコンストラクタの呼び出しが可能
    }

    // 2. staticファクトリーメソッドによるシングルトン
    public static Elvis getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
        // ...
    }

    /**
     * シングルトン特性を保持するためのreadResolveメソッド<br>
     * シリアライズ可能にするには、implements Serializable だけでは不十分。<br>
     * 全てのインスタンスフィールドを transient にしてreadResolveメソッドを提供する。
     * 
     * @return Elvis
     * 
     */
    private Object readResolve() {
        // 本物のインスタンスを返して、偽物インスタンスをGCさせる
        return INSTANCE;
    }
}
