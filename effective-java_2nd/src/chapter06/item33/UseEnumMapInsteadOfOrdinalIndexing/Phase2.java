/**
 *
 */
package chapter06.item33.UseEnumMapInsteadOfOrdinalIndexing;

import java.util.EnumMap;
import java.util.Map;

/**
 * 序数インデックスの代わりにEnumMapを使用する<br>
 * データとenumの組を関連付けるためにネストしたEnumMapを使用
 *
 * @author sinokuma
 *
 */
public enum Phase2 {
    SOLID, LIQUID, GAS;

    public enum Transition2 {
        MELT(SOLID, LIQUID), FREEZE(SOLID, LIQUID),
        BOIL(LIQUID, GAS), CONDENSE(GAS, LIQUID),
        SUBLIME(SOLID, GAS), DEPOSIT(GAS, SOLID);

        private final Phase2 src;
        private final Phase2 dst;

        Transition2(Phase2 src, Phase2 dst) {
            this.src = src;
            this.dst = dst;
        }

        // 相転移マップを初期化
        private static final Map<Phase2, Map<Phase2, Transition2>> m = new EnumMap<>(Phase2.class);
        static {
            for (Phase2 p : Phase2.values())
                m.put(p, new EnumMap<Phase2, Transition2>(Phase2.class));
            for (Transition2 trans : Transition2.values())
                m.get(trans.src).put(trans.dst, trans);
        }

        public static Transition2 from(Phase2 src, Phase2 dst) {
            return m.get(src).get(dst);
        }
    }
}
