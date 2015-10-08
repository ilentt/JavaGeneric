package vn.elca.training;

import java.util.ArrayList;

public class GenericSimple {
	
	public GenericSimple() {
		// constructor
	}
	
	public void runApp() {
		ArrayList<String> userName = new ArrayList<String>();
		userName.add("Tom");
		userName.add("Jerry");
		for(String username : userName) {
			System.out.println(username);
		}
	}
	
	public static void main(String[] args) {
		GenericSimple g = new GenericSimple();
		g.runApp();
	}
}
