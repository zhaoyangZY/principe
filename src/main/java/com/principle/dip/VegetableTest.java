package com.principle.dip;

import com.principle.ocp.EggplantDiscountVegetable;

/**
 * Filename: VegetableTest$.java
 * Description: 依赖倒置原则（Dependence Inversion Principle,DIP）是指设计代码结构时，高层模块不应该依 赖底层模块，二者都应该依赖其抽象。
 *
 * @author: zhaoy
 * @version: 1.0
 * Create at: 2021/1/10$ 下午3:24$
 * <p>
 * Modification History:
 * Date Author Version Description
 * ------------------------------------------------------------------
 * 2021/1/10$ zhaoy 1.0 1.0 Version
 */
public class VegetableTest {
    public static void main(String[] args) {
        ZhaoY zhaoY = new ZhaoY(new CukeVegetable());
        zhaoY.likeVegetable();

    }
}