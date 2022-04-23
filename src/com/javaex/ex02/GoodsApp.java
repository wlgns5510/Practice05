package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods(); //기본생산자가 없어서 오류
		Goods cup = new Goods("머그컵", 2000);
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showlnfo();
		cup.showlnfo();
	}

}


