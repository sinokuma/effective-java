/**
 *
 */
package chapter05.item29.ConsiderTypesafeHeterogeneousContainers;

/**
 * 型安全な異種コンテナを検討する<br>
 * クライアント
 *
 * @author sinokuma
 *
 */
public class FavoriteClient {

    public static void main(String[] args) {
        Favorites f = new Favorites();
        f.putFavorite(String.class, "Java");
        f.putFavorite(Integer.class, 0xcafebebe);
        f.putFavorite(Class.class, Favorites.class);

        String favoriteString = f.getFavorite(String.class);
        int favoriteInteger = f.getFavorite(Integer.class);
        Class<?> favoriteClass = f.getFavorite(Class.class);

        System.out.printf("%s %x %s%n", favoriteString, favoriteInteger, favoriteClass.getName());
    }

}
