/**
 *
 */
package chapter07.item41.UseOverloadingJudiciously;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * オーバーロードを注意して使用する
 *
 * @author sinokuma
 *
 */
public class SetList {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }

        for (int i = 0; i < 3; i++) {
            set.remove(i);
            // オーバーロードしているremove(int i)が呼ばれる
            // list.remove((Integer) i) または list.remove(Integer.valueOf(i))でSetと同一の結果になる
            list.remove(i);
        }

        System.out.println(set + " " + list);

    }

}
