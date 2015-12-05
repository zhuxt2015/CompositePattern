package com.zhuxt.entity;

/**
 * Created by Administrator on 2015/12/5.
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void print() {
        allMenus.print();
    }
}
