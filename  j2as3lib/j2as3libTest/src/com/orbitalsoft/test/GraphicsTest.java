package com.orbitalsoft.test;

import flash.display.*;

public class GraphicsTest extends MovieClip {

	public GraphicsTest() {
		this.graphics.lineStyle(2, 0x000000);
		this.graphics.moveTo(100, 200);
		this.graphics.lineTo(150, 250);
		this.graphics.curveTo(200, 300, 250, 250);
		
		this.graphics.drawRect(50, 50, 300, 250);
		
		this.graphics.drawRoundRect(40, 40, 320, 270, 25, 25);
		
		this.graphics.drawCircle(150, 100, 20);
		
		this.graphics.drawEllipse(180, 150, 40, 70);
		this.graphics.beginFill(0x333333);
		this.graphics.drawCircle(250, 100, 20);
	}
}
