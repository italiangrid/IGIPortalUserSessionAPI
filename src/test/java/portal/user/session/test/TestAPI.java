package portal.user.session.test;

import portal.user.session.api.HelloWorld;

public class TestAPI {

	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld();
		System.out.println(hw.getHelloWorld());
	}
}
