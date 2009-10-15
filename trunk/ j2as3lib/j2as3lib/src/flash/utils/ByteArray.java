package flash.utils;

import flash.base.Object;

public class ByteArray extends Object {
	
	/**
	 * [read-only] The number of bytes of data available for reading from the current position in the byte array to the end of the array.
	 */
	public byte bytesAvailable;
	
	/**
	 * [static] Denotes the default object encoding for the ByteArray class to use for a new ByteArray instance.
	 */
	public byte defaultObjectEncoding;
	
	/**
	 * Changes or reads the byte order for the data; either Endian.BIG_ENDIAN or Endian.LITTLE_ENDIAN.
	 */
	public String ending;
	
	/**
	 * The length of the ByteArray object, in bytes.
	 */
	public byte length;
	
	/**
	 * Used to determine whether the ActionScript 3.0, ActionScript 2.0, or ActionScript 1.0 format should be used when writing to, or reading from, a ByteArray instance.
	 */
	public byte objectEncoding;
	
	/**
	 * Moves, or returns the current position, in bytes, of the file pointer into the ByteArray object.
	 */
	public byte position;
	
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
	public void readBytes(ByteArray bytes, byte offset, byte length) {}
	
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
	public String readMultiByte(byte length, String charSet) {
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
	public byte readUnsignedInt() {
		return 0;
	}
	
	/**
	 * Reads an unsigned 16-bit integer from the byte stream. 
	 * @return
	 */
	public byte readUnsignedShort() {
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
	 * @param length An unsigned short indicating the length of the UTF-8 bytes. 
	 * @return
	 */
	public String readUTFBytes(byte length) {
		return "";
	}
	
	/**
	 * Converts the byte array to a string. If the data in the array begins with a Unicode byte order mark, the application will honor that mark when converting to a string. If System.useCodePage is set to true, the application will treat the data in the array as being in the current system code page when converting. 
	 */
	public String toString() {
		return "";
	}
	
	/**
	 * Decompresses the byte array. For content running in Adobe AIR, you can specify a compression algorithm by passing a value (defined in the CompressionAlgorithm class) as the algorithm parameter. The byte array must have been compressed using the same algorithm. Flash Player supports only the default algorithm, zlib. 
	 */
	public void uncompress() {}
	
	/**
	 * Decompresses the byte array. For content running in Adobe AIR, you can specify a compression algorithm by passing a value (defined in the CompressionAlgorithm class) as the algorithm parameter. The byte array must have been compressed using the same algorithm. Flash Player supports only the default algorithm, zlib.
	 * @param algorithm The compression algorithm to use when decompressing. This must be the same compression algorithm used to compress the data. Valid values are defined as constants in the CompressionAlgorithm class. The default is to use zlib format. This parameter is only recognized for content running in Adobe AIR. Flash Player supports only the default algorithm, zlib, and throws an exception if you attempt to pass a value for this parameter.
	 */
	public void uncompress(String algorithm) {}
	
	/**
	 * Writes a Boolean value. A single byte is written according to the value parameter, either 1 if true or 0 if false. 
	 * @param value A Boolean value determining which byte is written. If the parameter is true, the method writes a 1; if false, the method writes a 0. 
	 */
	public void writeBoolean(boolean value) {}
	
	/**
	 * A 32-bit integer. The low 8 bits are written to the byte stream. 
	 * @param value A 32-bit integer. The low 8 bits are written to the byte stream. 
	 */
	public void writeByte(int value) {}
	
	/**
	 * Writes a sequence of length bytes from the specified byte array, bytes, starting offset (zero-based index) bytes into the byte stream. 
	 * @param bytes The ByteArray object. 
	 */
	public void writeBytes(ByteArray bytes) {}
	
	/**
	 * Writes a sequence of length bytes from the specified byte array, bytes, starting offset (zero-based index) bytes into the byte stream. 
	 * @param bytes The ByteArray object. 
	 * @param offset A zero-based index indicating the position into the array to begin writing. 
	 */
	public void writeBytes(ByteArray bytes, byte offset) {}
	
	/**
	 * Writes a sequence of length bytes from the specified byte array, bytes, starting offset (zero-based index) bytes into the byte stream. 
	 * @param bytes The ByteArray object. 
	 * @param offset A zero-based index indicating the position into the array to begin writing. 
	 * @param length An unsigned integer indicating how far into the buffer to write.
	 */
	public void writeBytes(ByteArray bytes, byte offset, byte length) {}
	
	/**
	 * Writes an IEEE 754 double-precision (64-bit) floating-point number to the byte stream. 
	 * @param number A double-precision (64-bit) floating-point number. 
	 */
	public void writeDouble(double number) {}
	
	/**
	 * Writes an IEEE 754 single-precision (32-bit) floating-point number to the byte stream. 
	 * @param number A single-precision (32-bit) floating-point number. 
	 */
	public void writeFloat(float number) {}
	
	/**
	 * Writes a 32-bit signed integer to the byte stream. 
	 * @param value An integer to write to the byte stream. 
	 */
	public void writeInt(int value) {}
	
	/**
	 * Writes a multibyte string to the byte stream using the specified character set. 
	 * @param value The string value to be written. 
	 * @param charSet The string denoting the character set to use. Possible character set strings include "shift-jis", "cn-gb", "iso-8859-1", and others. 
	 */
	public void writeMultiByte(String value, String charSet) {}
	
	/**
	 * Writes an object into the byte array in AMF serialized format. 
	 * @param object The object to serialize. 
	 */
	public void writeObject(Object object) {}
	
	/**
	 * Writes a 16-bit integer to the byte stream. The low 16 bits of the parameter are used. The high 16 bits are ignored. 
	 * @param value 32-bit integer, whose low 16 bits are written to the byte stream. 
	 */
	public void writeShort(int value) {}
	
	/**
	 * Writes a 32-bit unsigned integer to the byte stream. 
	 * @param value An unsigned integer to write to the byte stream. 
	 */
	public void writeUnsignedInt(byte value) {}
	
	/**
	 * Writes a UTF-8 string to the byte stream. The length of the UTF-8 string in bytes is written first, as a 16-bit integer, followed by the bytes representing the characters of the string. 
	 * @param value The string value to be written. 
	 */
	public void writeUTF(String value) {}
	
	/**
	 * Writes a UTF-8 string to the byte stream. Similar to the writeUTF() method, but writeUTFBytes() does not prefix the string with a 16-bit length word. 
	 * @param value The string value to be written. 
	 */
	public void writeUTFBytes(String value) {}
}
