package com.nt.errors;

public class InvalidAccountException extends Exception {
  public InvalidAccountException(String msg) {
	super(msg);
  }
}
