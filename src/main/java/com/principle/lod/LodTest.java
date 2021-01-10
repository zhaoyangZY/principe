package com.principle.lod;

/**
 * Filename: LodTest$.java
 * Description: 迪米特原则（Law of Demeter LoD）是指一个对象应该对其他对象保持最少的了解，又叫最少知 道原则（Least Knowledge Principle,LKP），尽量降低类与类之间的耦合。
 *
 * @author: zhaoy
 * @version: 1.0
 * Create at: 2021/1/10$ 下午4:40$
 * <p>
 * Modification History:
 * Date Author Version Description
 * ------------------------------------------------------------------
 * 2021/1/10$ zhaoy 1.0 1.0 Version
 */
public class LodTest {
    public static void main(String[] args) {
        TeamLeader teamLeader = new TeamLeader();
        Business business = new Business();
        teamLeader.courser(business);
    }
}