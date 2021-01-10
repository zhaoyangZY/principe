package com.principle.srp;

/**
 * Filename: SrpTest$.java
 * Description: 单一职责（Simple Responsibility Pinciple，SRP）是指不要存在多于一个导致类变更的原因。
 *
 * @author: zhaoy
 * @version: 1.0
 * Create at: 2021/1/10$ 下午4:19$
 * <p>
 * Modification History:
 * Date Author Version Description
 * ------------------------------------------------------------------
 * 2021/1/10$ zhaoy 1.0 1.0 Version
 */
public class SrpTest {

    private static void modifyUser(String name, String address) {
        name = "小明";
        address = "上海";
    }

    private static void modifyUserName(String name) {
        name = "小明";
    }

    private static void modifyUserAddress(String address) {
        address = "上海";
    }
}