package com.principle.lsp;

/**
 * Filename: LspTest$.java
 * Description: 里氏替换原则（Liskov Substitution Principle,LSP）是指如果对每一个类型为 T1 的对象 o1,都有 类型为 T2 的对象 o2,使得以 T1 定义的所有程序 P 在所有的对象 o1 都替换成 o2 时，程序 P 的行为没 有发生变化，那么类型 T2 是类型 T1 的子类型。
 *
 * @author: zhaoy
 * @version: 1.0
 * Create at: 2021/1/10$ 下午4:51$
 * <p>
 * Modification History:
 * Date Author Version Description
 * ------------------------------------------------------------------
 * 2021/1/10$ zhaoy 1.0 1.0 Version
 */
public class LspTest {
    public static void test(Rectangle rectangle) {
        while (rectangle.getWidth() >= rectangle.getHeght()) {
            rectangle.setHeght(rectangle.getHeght() + 1);
            System.out.println("width:" + rectangle.getWidth() + ",height:" + rectangle.getHeght());
        }
        System.out.println("end width:" + rectangle.getWidth() + ",height:" + rectangle.getHeght());
    }

    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        rectangle.setHeght(10l);
//        rectangle.setWidth(20l);

        Square square = new Square();
        square.setLengeth(10l);
        test(square);
    }
}