package com.myStore.testing;

import java.net.InetAddress;
import java.net.UnknownHostException;
public class GetSystemInfo {

	public static void main(String[] args) throws UnknownHostException {
		System.out.println(InetAddress.getLocalHost().getHostName());
		
		System.out.println(System.getProperty("os.name"));
		
		System.out.println(System.getProperty("user.dir"));

	}

}
