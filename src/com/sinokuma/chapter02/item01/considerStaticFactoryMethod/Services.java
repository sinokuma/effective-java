/**
 * 
 */
package com.sinokuma.chapter02.item01.considerStaticFactoryMethod;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * サービス登録とアクセスのためのインスタンス化不可能クラス
 * 
 * @author sinokuma
 *
 */
public class Services {

    private Services() {
        // インスタンス化を抑制
    }

    // サービス名とサービスを対応づける
    private static final Map<String, Provider> providers = new ConcurrentHashMap<>();
    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    // プロバイダー登録API
    public static void registerDefaultProvider(Provider p) {
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }
    public static void registerProvider(String name, Provider p) {
        providers.put(name, p);
    }

    // サービスアクセスAPI
    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }
    public static Service newInstance(String name) {
        Provider p = providers.get(name);
        if (p == null)
            throw new IllegalArgumentException("No provider registered with name: " + name);
        return p.newService();
    }
}
