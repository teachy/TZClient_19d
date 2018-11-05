package com.tu.pojo.enums;


public enum SfEnum {
	 SF_("请选择",0),
	 SF_XXHG("超级算法1", 1), 
	 SF_GLFB("超级算法2", 2), 
	 SF_GJ1("超级算法3", 3), 
	 SF_GJ2("超级算法4", 4);
    // 构造方法
    private String name;
    private int index;
    private SfEnum(String name, int index) {
        this.name = name;
        this.index = index;
    }
    // 覆盖方法
    @Override
    public String toString() {
        return this.name;
    }
}
