package com.principle.ocp;

/**
 * Filename: EggplantVegetable$.java
 * Description: 茄子
 *
 * @author: zhaoy
 * @version: 1.0
 * Create at: 2021/1/10$ 下午3:20$
 * <p>
 * Modification History:
 * Date Author Version Description
 * ------------------------------------------------------------------
 * 2021/1/10$ zhaoy 1.0 1.0 Version
 */
public class EggplantVegetable implements IVegetable {
    private Integer id;
    private String name;
    private Double price;

    public EggplantVegetable(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }
}
