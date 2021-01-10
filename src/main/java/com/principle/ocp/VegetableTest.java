package com.principle.ocp;

/**
 * Filename: VegetableTest$.java
 * Description: 开闭原则（Open-Closed Principle, OCP）是指一个软件实体如类、模块和函数应该对扩展开放， 对修改关闭。
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
        EggplantDiscountVegetable vegetable = new EggplantDiscountVegetable(1, "茄子",20D);
        System.out.println("原价：" + vegetable.getOriginalPrice());
        System.out.println("现价：" + vegetable.getPrice());

    }
}