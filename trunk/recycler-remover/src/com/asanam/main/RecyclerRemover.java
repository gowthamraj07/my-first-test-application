package com.asanam.main;

import java.io.File;
import java.io.FileFilter;

import org.apache.commons.io.filefilter.HiddenFileFilter;

public class RecyclerRemover {
	
	private static int count = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File f = new File("D:\\");
		for(File f1:f.listFiles()){
			//System.out.println(f1.getAbsolutePath());
			findRecycler(f1);
		}

		System.out.println("Find count : "+count);
	}
	
	private static void findRecycler(File f){
		if(f.isDirectory() && count<100){
			if(f.getName().equalsIgnoreCase("recycler")){
				System.out.print("File Found -->"+f.getAbsolutePath());
				System.out.println(",File Delete status : "+f.delete());
				count++;
			}/*else{
				try {
					for(File f1: f.listFiles()){
						findRecycler(f1);
					}
				} catch (Exception e) {
					System.out.println("Exception : "+e.getMessage()+"-->"+f.getName());
					
				}
			}*/
		}
	}

}
