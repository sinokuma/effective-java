/**
 *
 */
package com.sinokuma.chapter05.item29.ConsiderTypesafeHeterogeneousContainers;

import java.util.HashMap;
import java.util.Map;

/**
 * 型安全な異種コンテナを検討する<br>
 * 型安全な異種コンテナパターン
 *
 * @author sinokuma
 *
 */
public class Favorites {

    private Map<Class<?>, Object> favorites = new HashMap<>();

    // 動的キャストで実行時型安全性を達成する
    public <T> void putFavorite(Class<T> type, T instance) {
        if (type == null)
            throw new NullPointerException("Type is null");
        favorites.put(type, type.cast(instance));
    }

    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorites.get(type));
    }
}
