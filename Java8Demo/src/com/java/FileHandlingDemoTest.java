package com.java;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class FileHandlingDemoTest {

	@Test
	void test() {
		try {
			FileOutputStream fis= new FileOutputStream("d://details.txt");
			String s= "my name is Nayan ";
			byte b[] = s.getBytes();
			try {
				fis.write(b);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
