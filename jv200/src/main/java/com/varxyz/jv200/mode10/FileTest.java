package com.varxyz.jv200.mode10;

import java.io.File;

public class FileTest {
	private static final String SAVE_DIR = "C:\\temp";
	public static void main(String[] args) {
		File SaveDir = new File(SAVE_DIR);
		System.out.println(SaveDir.getPath());
		System.out.println("Window :" + File.separator);

	}

}
