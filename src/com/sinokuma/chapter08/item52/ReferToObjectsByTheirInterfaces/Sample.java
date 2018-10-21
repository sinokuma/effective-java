package com.sinokuma.chapter08.item52.ReferToObjectsByTheirInterfaces;

import java.util.List;
import java.util.Vector;

/**
 * インタフェースでオブジェクトを参照する
 * 適切なインタフェース型が存在するならば、パラメータ、戻り値、変数、およぼフィールドはすべてインタフェース型を使用して宣言されるべき
 *
 * @author sinokuma
 */
public class Sample {
    // 良い - 型としてインタフェースを使用
    // インタフェース型でフィールドを宣言することで、誠実になれる(keep your honest)
    List<String> goodSubscribers = new Vector<>();
    // 悪い - 型としてクラスを使用
    Vector<String> badSubscribers = new Vector<>();
}
