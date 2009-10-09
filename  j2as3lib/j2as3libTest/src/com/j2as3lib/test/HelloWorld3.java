package com.j2as3lib.test;

import flash.display.*;
import flash.text.*;

public class HelloWorld3 extends MovieClip {
	
	public HelloWorld3() {
		// do some cool stuff
		TextField myText = new TextField();
		myText.text = "Hello World";
		myText.x = 40;
		myText.y = 100;
		
		addChild(myText);
	}
}
