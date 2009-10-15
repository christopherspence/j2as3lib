package flash.utils;

import flash.events.EventDispatcher;

public class Timer extends EventDispatcher {
	
	// PROPERTIES
	
	/**
	 * [read-only] The total number of times the timer has fired since it started at zero.
	 */
	public int currentCount;
	
	/**
	 * The delay, in milliseconds, between timer events.
	 */
	public float delay;
	
	/**
	 * The total number of times the timer is set to run.
	 */
	public int repeatCount;
	
	/**
	 * [read-only] The timer's current state; true if the timer is running, otherwise false.
	 */
	public boolean running;
	
	// METHODS
	
	/**
	 * Constructs a new Timer object with the specified delay and repeatCount states.
	 * @param delay The delay between timer events, in milliseconds. 
	 */
	public Timer(float delay) {}
	
	/**
	 * Constructs a new Timer object with the specified delay and repeatCount states.
	 * @param delay The delay between timer events, in milliseconds.
	 * @param repeatCount Specifies the number of repetitions. If zero, the timer repeats infinitely. If nonzero, the timer runs the specified number of times and then stops. 
	 */
	public Timer(float delay, int repeatCount) {}
	
	/**
	 * Stops the timer, if it is running, and sets the currentCount property back to 0, like the reset button of a stopwatch. Then, when start() is called, the timer instance runs for the specified number of repetitions, as set by the repeatCount value. 
	 */
	public void reset() {}
	
	/**
	 * Starts the timer, if it is not already running. 
	 */
	public void start() {}
	
	/**
	 * Stops the timer. When start() is called after stop(), the timer instance runs for the remaining number of repetitions, as set by the repeatCount property. 
	 */
	public void stop() {}
}
