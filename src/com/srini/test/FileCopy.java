package com.srini.test;

/**
 This is Program to copy songs from Windows Play list Created by Srinivasarao Daruna
 Apache's Common's Jar is required to user FileUtils class and its static method CopyFileToDirectory()
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileCopy {
	
	public static void main(String[] args)
	{
		Long startTime = System.currentTimeMillis();
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:/Users/lenovo/Music/Playlists/unsaved.wpl"));
			String line = br.readLine();
			String[] splits;
			String song = null;
			String song_name;
			File mp3_song;
			File dest = new File("H:/Songs");
			int count = 0;
			while(line != null)
			{
				
				if(line.contains("media"))
				{
					count++;
					splits = line.split("\"");
					song = splits[1].replace("\\", "/").replace("../../" , "C:/Users/lenovo/");
					mp3_song = new File(song);
					if(mp3_song.exists())
						System.out.println(song + " is exists");
					//Pick up the song Name
					splits = song.split("/");
					song_name = splits[splits.length - 1];
					System.out.println(" Song name  is " + song_name );
					
					//Create the Directory if it is not existing
					if(!dest.exists())
					{
						dest.mkdir();
					}
					
					//Copy the file using Apache's commons package FileUtils class
					//FileUtils.copyFileToDirectory(new File(song), dest);
				}
				line = br.readLine();
				
				
			}
			System.out.println(" Total songs count " + count);
			
			br.close();
			
			Long endTime = System.currentTimeMillis();
			
			System.out.println(" Total time take in seconds " + ( endTime - startTime));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
