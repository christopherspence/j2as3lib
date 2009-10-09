package flash.display;

import flash.geom.*;
import flash.media.*;

public class Sprite extends DisplayObjectContainer {

	/**
	 * Specifies the button mode of this sprite. 
	 * @return
	 */
	public boolean buttonMode;
	
	/**
	 * [read-only] Specifies the display object over which the sprite is being dragged, or on which the sprite was dropped.
	 */
	public DisplayObject dropTarget;
	
	/**
	 * [read-only] Specifies the Graphics object that belongs to this sprite where vector drawing commands can occur.
	 * @return
	 */
	public Graphics graphics;
	
	/**
	 * Designates another sprite to serve as the hit area for a sprite.
	 * @return
	 */
	public Sprite hitArea;
	
	/**
	 * Controls sound within this sprite.
	 */
	public SoundTransform soundTransform;
	
	/**
	 * A Boolean value that indicates whether the pointing hand (hand cursor) appears when the mouse rolls over a sprite in which the buttonMode property is set to true.
	 */
	public boolean useHandCursor;
	
	/**
	 * Creates a new Sprite instance
	 */
	public Sprite() {}
	
	/**
	 * Lets the user drag the specified sprite.
	 * @param lockCenter
	 * @param bounds
	 */
	public void startDrag(boolean lockCenter, Rectangle bounds) {}
	
	/**
	 * Ends the startDrag() method.
	 */
	public void stopDrag() {}
}
