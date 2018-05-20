/**
 *
 */
package chapter06.item32.UseEnumSetInsteadOfBitField;

import java.util.Set;

/**
 * ビットフィールドの代わりにEnumSetを使用する<br>
 * EnumSet - 　ビットフィールドの最新の置換
 *
 * @author sinokuma
 *
 */
public class Text2 {
    public enum Style { BOLD, ITALIC, UNDERLINE, STRIKETHROUGH }

    // どのようなSetでも渡せるが、EnumSetが明らかに最善
    public void applyStyles(Set<Style> styles) {
        // do nothing
    }
}
