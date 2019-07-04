package org.cap.demo;

public class Sample {

	public static void main(String[] args) {
		System.out.println("Haii");
        SubDemo sub=new SubDemo();
        sub.show();
        display();
	}
	
	public static void display() {
		System.out.println("Display method ");
	}

}
