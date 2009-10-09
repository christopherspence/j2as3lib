package flash.display;

import flash.base.Array;
import flash.geom.*;

/**
 * The Graphics class contains a set of methods that you can use to create a vector shape. Display objects that support drawing include Sprite and Shape objects. Each of these classes includes a graphics property that is a Graphics object. The following are among those helper functions provided for ease of use: drawRect(), drawRoundRect(), drawCircle(), and drawEllipse(). 
 *
 */
public class Graphics {
	
	/**
	 * Fills a drawing area with a bitmap image.
	 *	Graphics
	 */
	public void beginBitmapFill(BitmapData bitmap) {}
	
	/**
	 * Fills a drawing area with a bitmap image.
	 *	Graphics
	 */
	public void beginBitmapFill(BitmapData bitmap, Matrix matrix, boolean repeat, boolean smooth) {}
	
	/**
	 * Specifies a simple one-color fill that subsequent calls to other Graphics methods (such as lineTo() or drawCircle()) use when drawing.
	 */
	public void beginFill(int color) {}

	
	/**
	 * Specifies a simple one-color fill that subsequent calls to other Graphics methods (such as lineTo() or drawCircle()) use when drawing.
	 */
	public void beginFill(int color, float alpha) {}

	/**
	 * Specifies a gradient fill used by subsequent calls to other Graphics methods (such as lineTo() or drawCircle()) for the object.  	 	
	 */
	public void beginGradientFill(String type, Array colors, Array alphas, Array ratios) {}
		
	/**
	 * Specifies a gradient fill used by subsequent calls to other Graphics methods (such as lineTo() or drawCircle()) for the object.  	 	
	 */
	public void beginGradientFill(String type, Array colors, Array alphas, Array ratios, Matrix matrix, String spreadMethod, String interpolationMethod, int focalPointRatio) {}
	
	/**
	 * Specifies a shader fill used by subsequent calls to other Graphics methods (such as lineTo() or drawCircle()) for the object.  	 	
	 */
	public void beginShaderFill(Shader shader) {}
	
	/**
	 * Specifies a shader fill used by subsequent calls to other Graphics methods (such as lineTo() or drawCircle()) for the object.  	 	
	 */
	public void beginShaderFill(Shader shader, Matrix matrix) {}
			
	/*
	 * Clears the graphics that were drawn to this Graphics object, and resets fill and line style settings.
	 */
	public void clear() {} 
	
	/**
	 * Copies all of drawing commands from the source Graphics object into the calling Graphics object.
	 */
	public void copyFrom(Graphics sourceGraphics) {}
	
	/**
	 * Draws a curve using the current line style from the current drawing position to (anchorX, anchorY) and using the control point that (controlX, controlY) specifies. 	 	 	
	 */
	public void curveTo(int controlX, int controlY, int anchorX, int anchorY) {}
			
	/**
	 * Draws a circle.  	 	
	 */
	public void drawCircle(int x, int y, float radius) {}
	
	/**
	 * Draws an ellipse.	 	 	
	 */
	public void drawEllipse(int x, int y, int width, int height) {}
		
	/**
	 * Submits a series of IGraphicsData instances for drawing. 	 	
	 */
	//drawGraphicsData(graphicsData:Vector.<IGraphicsData>):void
	
	/**
	 * Submits a series of commands for drawing.	 	 	
	 */
	//drawPath(commands:Vector.<int>, data:Vector.<Number>, winding:String = "evenOdd"):void
	
	/**
	 * Draws a rectangle.	 	 	
	 */
	public void drawRect(int x, int y, int width, int height) {}
	
	/**
	 * Draws a rounded rectangle.	 	 	
	 */
	public void drawRoundRect(int x, int y, int width, int height, int ellipseWidth, int ellipseHeight) {}
	
	
	/**
	 * Renders a set of triangles, typically to distort bitmaps and give them a three-dimensional appearance.
	 */
	//drawTriangles(vertices:Vector.<Number>, indices:Vector.<int> = null, uvtData:Vector.<Number> = null, culling:String = "none"):void
	
	
	/**
	 * Applies a fill to the lines and curves that were added since the last call to the beginFill(), beginGradientFill(), or beginBitmapFill() method. 	 	
	 */
	public void endFill() {}
	
	/**
	 * Specifies a bitmap to use for the line stroke when drawing lines. 	 	
	 */
	public void lineBitmapStyle(BitmapData bitmap) {}
	
	/**
	 * Specifies a bitmap to use for the line stroke when drawing lines. 	 	
	 */
	public void lineBitmapStyle(BitmapData bitmap, Matrix matrix, boolean repeat, boolean smooth) {}
	
	/**
	 * Specifies a gradient to use for the stroke when drawing lines. 	 	 	
	 */
	public void lineGradientStyle(String type, Array colors, Array alphas, Array ratios) {}
	
	/**
	 * Specifies a gradient to use for the stroke when drawing lines. 	 	 	
	 */
	public void lineGradientStyle(String type, Array colors, Array alphas, Array ratios, Matrix matrix, String spreadMethod, String interpolationMethod, float focalPointRatio) {}

	/**
	 * Specifies a shader to use for the line stroke when drawing lines.
	 */
	public void lineShaderStyle(Shader shader) {}
	
	/**
	 * Specifies a shader to use for the line stroke when drawing lines.
	 */
	public void lineShaderStyle(Shader shader, Matrix matrix) {}
	
	/**
	 * Specifies a line style used for subsequent calls to Graphics methods such as the lineTo() method or the drawCircle() method. 	 	 	
	 */
	public void lineStyle(int thickness, int color) {}
	
	/**
	 * Specifies a line style used for subsequent calls to Graphics methods such as the lineTo() method or the drawCircle() method. 	 	 	
	 */
	public void lineStyle(int thickness, int color, float Alpha) {}
	
	/**
	 * Specifies a line style used for subsequent calls to Graphics methods such as the lineTo() method or the drawCircle() method. 	 	 	
	 */
	public void lineStyle(int thickness, int color, float alpha, boolean pixelHinting, String scaleMode, String caps, String joints, int miterLimit) {}
	
	/**
	 * 	Draws a line using the current line style from the current drawing position to (x, y); the current drawing position is then set to (x, y).
	 */
	public void lineTo(int x, int y) {}
		
	/**
	 *	Moves the current drawing position to (x, y). 
	 */
	public void moveTo(int x, int y) {}
	
}
