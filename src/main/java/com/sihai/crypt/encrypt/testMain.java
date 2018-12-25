package com.sihai.crypt.encrypt;

public class testMain {

	public static void main(String[] args) {
		MD5Tools md5=new MD5Tools();
		System.out.println(md5.encode("123456"));
		System.out.println("---------------------------------------");
		System.out.println(md5.hexStringToBytes("e10adc3949ba59abbe56e057f20f883e"));
	

	}

}
