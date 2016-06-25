package main;

import singleton.MySingleObject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MySingleObject instance = MySingleObject.getInstance();
		
		System.out.println(instance.getMessage());
	}

}
