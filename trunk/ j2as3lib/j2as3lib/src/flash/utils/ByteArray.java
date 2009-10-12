package flash.utils;

import flash.base.Object;

public class ByteArray extends Object {
	
	/**
	 * [read-only] The number of bytes of data available for reading from the current position in the byte array to the end of the array.
	 */
	public int bytesAvailable;
	
	/**
	 * [static] Denotes the default object encoding for the ByteArray class to use for a new ByteArray instance.
	 */
	public int defaultObjectEncoding;
	
	/**
	 * Changes or reads the byte order for the data; either Endian.BIG_ENDIAN or Endian.LITTLE_ENDIAN.
	 */
	public String ending;
	
	/**
	 * The length of the ByteArray object, in bytes.
	 */
	public int length;
	
	/**
	 * Used to determine whether the ActionScript 3.0, ActionScript 2.0, or ActionScript 1.0 format should be used when writing to, or reading from, a ByteArray instance.
	 */
	public int objectEncoding;
	
	/**
	 * Moves, or returns the current position, in bytes, of the file pointer into the ByteArray object.
	 */
	public int position;
	
	/**
	 * Creates a ByteArray instance representing a packed array of bytes, so that you can use the methods and properties in this class to optimize your data storage and stream.
	 */
	public ByteArray() {}
	
	/**
	 * Compresses the byte array.
	 * @param algorithm The compression algorithm to use when compressing
	 */
	public void compress(String algorithm) {}
	
	/**
	 * Reads a Boolean value from the byte stream.
	 * @return Returns true if the byte is nonzero, false otherwise. 
	 */
	public boolean readBoolean() {
		return true;
	}
	
	/**
	 * Reads a signed byte from the byte stream.
	 * @return An integer between -128 and 127. 
	 */
	public int readByte() {
		return 0;
	}
	
	/**
	 * Reads the number of data bytes, specified by the length parameter, from the byte stream.
	 * @param bytes The ByteArray object to read data into. 
	 * @param offset The offset (position) in bytes at which the read data should be written. 
	 * @param length The number of bytes to read. The default value of 0 causes all available data to be read. 
	 */
	public void readBytes(ByteArray bytes, int offset, int length) {}
	
	/**
	 * Reads an IEEE 754 double-precision (64-bit) floating-point number from the byte stream. 
	 * @return A double-precision (64-bit) floating-point number. 
	 */
	public double readDouble() {
		return 0;
	}
	
	/**
	 * Reads an IEEE 754 single-precision (32-bit) floating-point number from the byte stream. 
	 * @return A single-precision (32-bit) floating-point number. 
	 */
	public float readFloat() {
		return 0;
	}
	
	/**
	 * Reads a signed 32-bit integer from the byte stream. 
	 * @return A 32-bit signed integer between -2147483648 and 2147483647. 
	 */
	public int readInt() {
		return 0;		
	}
	
	/**
	 * Reads a multibyte string of specified length from the byte stream using the specified character set. 
	 * @param length The number of bytes from the byte stream to read. 
	 * @param charSet The string denoting the character set to use to interpret the bytes.
	 * @return UTF-8 encoded string. 
	 */
	public String readMultiByte(int length, String charSet) {
		return "";
	}
	
	/**
	 * Reads an object from the byte array, encoded in AMF serialized format. 
	 * @return The deserialized object. 
	 */
	public Object readObject() {
		return new Object();
	}
	
	/**
	 * Reads a signed 16-bit integer from the byte stream. 
	 * @return A 16-bit signed integer between -32768 and 32767. 
	 */
	public short readShort() {
		return 0;
	}
	
	/**
	 * Reads an unsigned byte from the byte stream.
	 * @return A 32-bit unsigned integer between 0 and 255. 
	 */
	public byte readUnsignedByte() {
		return 0;
	}
	
	/**
	 * Reads an unsigned 32-bit integer from the byte stream. 
	 * @return A 32-bit unsigned integer between 0 and 4294967295. 
	 */
	public int readUnsignedInt() {
		return 0;
	}
	
	/**
	 * Reads an unsigned 16-bit integer from the byte stream. 
	 * @return
	 */
	public int readUnsignedShort() {
		return 0;
	}
	
	/**
	 * Reads a UTF-8 string from the byte stream. The string is assumed to be prefixed with an unsigned short indicating the length in bytes. 
	 * @return UTF-8 encoded string.
	 */
	public String readUTF() {
		return "";
	}
	
	/**
	 * Reads a sequence of UTF-8 bytes specified by the length  parameter from the byte stream and returns a string. 
	 * @return
	 */
	public String readUTFBytes() {
		return "";
	}
	
	
}
