package com.xwrokz.Building.exception;

public class StorageFullException extends RuntimeException {
	
	public StorageFullException() {
		
	}
	
	public StorageFullException(String msg)
	{
		super(msg);
	}

}
