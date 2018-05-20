/**
 *
 */
package chapter06.item32.UseEnumSetInsteadOfBitField;

/**
 * ビットフィールドの代わりにEnumSetを使用する<br>
 * ビットフィールド列挙定数
 *
 * @author sinokuma
 *
 */
public class Text {
    public static final int STYLE_BOLD			= 1 << 0;	// 1
    public static final int STYLE_ITALIC		= 1 << 1;	// 2
    public static final int STYLE_UNDERLINE		= 1 << 2;	// 4
    public static final int STYLE_STRIKETHROUGH	= 1 << 3;	// 8

    // パラメータは、0個以上のSTYLE_定数のビット
    public void applyStyles(int styles) {
        // do nothing
    }
}
