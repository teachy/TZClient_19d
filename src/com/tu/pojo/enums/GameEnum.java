package com.tu.pojo.enums;

public enum GameEnum {
	Game_QXZ("请选择",0),
	Game_pc28("pc28", 1);
	private String name;
	private int index;
	private GameEnum(String name, int index) {
		this.name = name;
		this.index = index;
	}

    // 覆盖方法
    @Override
    public String toString() {
        return  this.name;
    }

}
