package com.sinokuma.chapter08.item53.PreferInterfacesToReflection;

import java.util.Arrays;
import java.util.Set;

/**
 * リフレクションよりインタフェースを選ぶ
 * 実行時に普通のアプリケーション内で、オブジェクトはリフレクションによってアクセスされるべきではない
 * リフレクションを使用する必要があるのは、サービスプロバイダフレームワークの実装のみ
 *
 * @author sinokuma
 */
public class Sample {
    // インタフェースアクセスでのリフレクションによるインスタンス化
    public static void main(String[] args) {
        // クラス名をClassオブジェクトへ変換する
        Class<?> cl = null;
        try {
            cl = Class.forName(args[0]);
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found.");
            System.exit(1);
        }

        // クラスのインスタンス化
        Set<String> s = null;
        try {
            s = (Set<String>) cl.newInstance();
        } catch (InstantiationException e) {
            System.err.println("Class not accesible.");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.err.println("Class not instantiable.");
            System.exit(1);
        }

        // セットを使用する
        s.addAll(Arrays.asList(args).subList(1, args.length));
        System.out.println(s);
    }
}
