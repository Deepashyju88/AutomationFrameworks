package oop.polymorphism;

public class MainFunctionOverload {

	public static void main(int[] args) {
		System.out.println("this is int data function");
	}
	
	public static void main() {
		System.out.println("this is dnormal main");
	}
	
	public static void main(String[] args) {
		System.out.println("this is default main function");
		main();
	}

}
