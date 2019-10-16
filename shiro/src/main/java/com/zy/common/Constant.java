package com.zy.common;

import com.baomidou.mybatisplus.core.toolkit.IdWorker;

/**
 * @Description :
 * @Author : zhangyan
 * @Date : 2019/10/16   15:40
 */
public class Constant {

    public static void main(String[] args) {
        long id = IdWorker.getId();

        System.out.println(id);
    }
}
