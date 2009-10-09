package com.orbitalsoft.test;

import flash.display.*;
import flash.events.*;

public class SpriteTest extends MovieClip {
	
	private Sprite sprite1;
	private Sprite sprite2;
	private Sprite sprite3;
	
	public SpriteTest() {
		
		sprite1 = new Sprite();
		sprite1.graphics.lineStyle(2, 0x000000);
		sprite1.graphics.beginFill(0xCCCCCC);
		sprite1.graphics.drawRect(0, 0, 200, 200);
		addChild(sprite1);
		
		sprite1.x = 50;
		sprite1.y = 50;
		
		sprite2 = new Sprite();
		sprite2.graphics.lineStyle(2, 0x000000);
		sprite2.graphics.beginFill(0xCCCCCC);
		sprite2.graphics.drawRect(0, 0, 200, 200);
		sprite2.x = 300;
		sprite2.y = 50;
		
		addChild(sprite2);
		
		sprite3 = new Sprite();
		sprite3.graphics.lineStyle(2, 0x000000);
		sprite3.graphics.beginFill(0x333333);
		sprite3.graphics.drawCircle(0, 0, 25);
		sprite3.x = 100;
		sprite3.y = 100;
		sprite1.addChild(sprite3);
		
		sprite1.addEventListener(MouseEvent.CLICK, clickSprite);
		sprite2.addEventListener(MouseEvent.CLICK, clickSprite);	
		
		
	}
	
	private void clickSprite(MouseEvent event) {
		Sprite currentSprite = (Sprite)event.currentTarget;
		currentSprite.addChild(sprite3);
	}
}
