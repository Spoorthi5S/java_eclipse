package com.xwrokz.Theater.exception;

public class StorageFullException extends RuntimeException {
	
	public StorageFullException() {
		
	}
	
	public StorageFullException(String msg)
	{
		super(msg);
	}

}
