package com.principle.ocp;

/**
 * Filename: EggplantDiscountVegetable$.java
 * Description: 茄子打折
 *
 * @author: zhaoy
 * @version: 1.0
 * Create at: 2021/1/10$ 下午3:26$
 * <p>
 * Modification History:
 * Date Author Version Description
 * ------------------------------------------------------------------
 * 2021/1/10$ zhaoy 1.0 1.0 Version
 */
public class EggplantDiscountVegetable extends EggplantVegetable {
    public EggplantDiscountVegetable(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginalPrice() {
        return super.getPrice();
    }

    public Double getPrice() {
        return super.getPrice() * 0.5;
    }
}