package com.principle.carp;

/**
 * Filename: MysqlConnection$.java
 * Description: TODO
 *
 * @author: zhaoy
 * @version: 1.0
 * Create at: 2021/1/10$ 下午5:09$
 * <p>
 * Modification History:
 * Date Author Version Description
 * ------------------------------------------------------------------
 * 2021/1/10$ zhaoy 1.0 1.0 Version
 */
public class MysqlConnection implements DBConnection {
    @Override
    public void getConnection() {
        System.out.println("mysql");
    }
}