package com.xwrokz.Bakery.exception;

public class StorageFullException extends RuntimeException {
	
	public StorageFullException() {
		
	}
	
	public StorageFullException(String msg)
	{
		super(msg);
	}

}
