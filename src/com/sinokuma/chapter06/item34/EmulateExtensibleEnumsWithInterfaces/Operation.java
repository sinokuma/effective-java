/**
 *
 */
package com.sinokuma.chapter06.item34.EmulateExtensibleEnumsWithInterfaces;

/**
 * 拡張可能なenumをインタフェースで模倣する<br>
 * インタフェースを使用して模倣された拡張可能なenum
 *
 * @author sinokuma
 *
 */
public interface Operation {
    double apply(double x, double y);
}