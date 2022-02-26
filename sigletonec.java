/////////////////
package Inheritence.commm;

import Inheritence.commm.sigletonec;

public class sigletonec {
	private static sigletonec t = null;

	private sigletonec() {
		System.out.println("singlton constructor");
	}

	private static sigletonec getInstance() {
		//  OR OR public static sigletonec getInstance() {
		if (t == null) {
			t = new sigletonec();
		}
		System.out.println("This is t fred arunf " + t.toString());
		return t;
	}

	public static void main(String[] args) {
		System.out.println("this is t class");
		sigletonec.getInstance();
	}
}
