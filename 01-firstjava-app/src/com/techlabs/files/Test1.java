package com.techlabs.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		FileInputStream filestream=new FileInputStream("C:/Users/vismi/Downloads/Telegram Desktop/Assignments-Monocept/text1.txt");
		int ch;
		
		while((ch=filestream.read())!=-1) 
		System.out.print((char)ch);
		FileOutputStream fileoutstream=new FileOutputStream("Output.text");
		filestream.close();

	}

}
