package com.principle.lsp;

/**
 * Filename: Square$.java
 * Description: 正方形
 *
 * @author: zhaoy
 * @version: 1.0
 * Create at: 2021/1/10$ 下午4:57$
 * <p>
 * Modification History:
 * Date Author Version Description
 * ------------------------------------------------------------------
 * 2021/1/10$ zhaoy 1.0 1.0 Version
 */
public class Square extends Rectangle {
    private Long lengeth;

    public Long getLengeth() {
        return lengeth;
    }

    public void setLengeth(Long lengeth) {
        this.lengeth = lengeth;
    }

    @Override
    public Long getHeght() {
        return getLengeth();
    }

    @Override
    public void setHeght(Long heght) {
        setLengeth(heght);
    }

    @Override
    public Long getWidth() {
        return getLengeth();
    }

    @Override
    public void setWidth(Long width) {
        setLengeth(width);
    }
}