package com.tu.pojo.enums;


public enum WzEnum {
	 WZ_QXZ("请选择",0), 
	 WZ_19D("19豆网", 1),
	 WZ_XM("新梦网", 2), 
	 WZ_BT("比特网", 3); 
    // 构造方法
    private String name;
    private int index;
    private WzEnum(String name, int index) {
        this.name = name;
        this.index = index;
    }
    // 覆盖方法
    @Override
    public String toString() {
        return this.name;
    }
}
