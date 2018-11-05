package com.tu.pojo.enums;


public enum SfEnumPL {
	 SF_("请选择",0),
	 SF_PL1("低赔率", 1), 
	 SF_PL2("高赔率", 2), 
	 SF_PL3("中间赔率", 3), 
	 SF_PL4("比上期高的赔率", 4),
	 SF_PL5("比上期低的赔率", 5),
	 SF_PL6("对比赔率算法", 6);
    // 构造方法
    private String name;
    private int index;
    private SfEnumPL(String name, int index) {
        this.name = name;
        this.index = index;
    }
    // 覆盖方法
    @Override
    public String toString() {
        return this.name;
    }

}
