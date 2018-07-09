/**
 *
 */
package com.sinokuma.chapter07.item44.WriteDocCommentsForAllExposedAPIElements;

/**
 * すべての公開API要素に対してドキュメントコメントを書く<br>
 * enum型を文書化する際には、定数も文書化する<br>
 *
 * An instrument setion of symphony orchestra.
 *
 * @author sinokuma
 *
 */
public enum OrchestraSection {

    /** Woodwinds, such as flute, clarinet and oboe. */
    WOODWIND,

    /** Brass instruments, such as french horn and trumpet. */
    BRASS,

    /** Percussion instruments, such as timpani and cymbals. */
    PERCUSSION,

    /** Stringed instruments, such as violin and cello. */
    STRING;
}
