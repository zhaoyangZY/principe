package com.principle.lod;

import java.util.ArrayList;
import java.util.List;

/**
 * Filename: Business$.java
 * Description: 业务
 *
 * @author: zhaoy
 * @version: 1.0
 * Create at: 2021/1/10$ 下午4:43$
 * <p>
 * Modification History:
 * Date Author Version Description
 * ------------------------------------------------------------------
 * 2021/1/10$ zhaoy 1.0 1.0 Version
 */
public class Business {
//    public void courseSize(List<Course> list) {
//        System.out.println("当前课程的数量是：" + list.size());
//    }

    public void  courseSize() {
        List<Course> list = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            list.add(new Course());
        }
        System.out.println("当前课程的数量是：" + list.size());
    }
}