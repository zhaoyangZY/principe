package com.principle.dip;

/**
 * Filename: ZhaoY$.java
 * Description: 实体类
 *
 * @author: zhaoy
 * @version: 1.0
 * Create at: 2021/1/10$ 下午4:07$
 * <p>
 * Modification History:
 * Date Author Version Description
 * ------------------------------------------------------------------
 * 2021/1/10$ zhaoy 1.0 1.0 Version
 */
public class ZhaoY {
    private IVegetalbe vegetalbe;

    public ZhaoY(IVegetalbe vegetalbe) {
        this.vegetalbe = vegetalbe;
    }

    public void likeVegetable() {
        vegetalbe.likeVegetable();
    }
}