package Hit;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Hitlight hl=new Hitlight();
		hl.li=new Bluelight();
		hl.bright();

	}

}

class Hitlight {
	Light li;

	public void bright() {
		System.out.println(li);
	}
}

class Light {

}

class Bluelight extends Light {

}

class Greenlight extends Light {

}