package com.javaex.shape.v1;

//	추상 클래스 : 인스턴스화 되지 않은 설계도 클래스
public abstract class Shape {//???????????????????????????????추상 클래스 왜만들어 
	// 	필드
	protected int x;
	protected int y;
	
	//	생성자
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//	추상 메서드 : 실체 클래스에서 반드시 구현 강제
	public abstract double area();
	public abstract void draw();
}
