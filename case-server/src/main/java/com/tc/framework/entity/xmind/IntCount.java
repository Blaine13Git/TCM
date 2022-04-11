package com.tc.framework.entity.xmind;

/**
 * 数字封装
 *
 */
public class IntCount {
    int value;
    public IntCount(int value) {
        this.value = value;
    }
    public void add() {
        this.value ++;
    }
    public int get() {
        return this.value;
    }
    public void del() {
        this.value --;
    }
    public void set(int value) {
        this.value = value;
    }
}
