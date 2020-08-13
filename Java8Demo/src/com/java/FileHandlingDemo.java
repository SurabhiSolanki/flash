package com.java;

import java.awt.image.BufferedImage;
import java.io.*;
import java.io.FileInputStream;

import javax.imageio.ImageIO;

public class FileHandlingDemo {
	public static void main(String[]args) {
		try {
			FileOutputStream fis= new FileOutputStream("d://details.txt");
			FileInputStream fos= new FileInputStream("C:\\Users\\surabhi\\Downloads\\Ass.pdf");
			File f = new File ("C:\\Users\\surabhi\\Desktop\\surabhi.jfif");
			BufferedImage img = ImageIO.read(f);
			ImageIO.write(img, "gif", new File("outing.gif"));
			
			String s= "my name is Nayan ";
			byte b[] = s.getBytes();
			fis.write(b);
			int i=0;
			while((i=fos.read())!= -1) {
				System.out.print((char)i);
			}
			
		}catch(Exception ex) {
			
			ex.printStackTrace();
		}
	}

}
