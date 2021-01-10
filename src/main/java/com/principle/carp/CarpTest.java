package com.principle.carp;

/**
 * Filename: CarpTest$.java
 * Description: 合成复用原则（Composite/Aggregate Reuse Principle,CARP）是指尽量使用对象组合(has-a)/ 聚合(contanis-a)，而不是继承关系达到软件复用的目的。
 *
 * @author: zhaoy
 * @version: 1.0
 * Create at: 2021/1/10$ 下午5:06$
 * <p>
 * Modification History:
 * Date Author Version Description
 * ------------------------------------------------------------------
 * 2021/1/10$ zhaoy 1.0 1.0 Version
 */
public class CarpTest {
    public static void main(String[] args) {
        DBConnection dbConnection = new MysqlConnection();
        dbConnection.getConnection();
    }
}