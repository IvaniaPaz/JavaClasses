package com.class14;

public class ReplaceMethodRecap {

	public static void main(String[] args) {
		
		String str="Video provides a powerful way to help you prove your point."
				+ " When you click Online Video,"
				+ " you can paste in the embed code for the video you want to add";
		
		//this will only replace the Video with upper case only and change it to Audio, so it'll leave the lower case video there
		System.out.println(str.replace("Video", "Audio"));
		//this will replace all videos (lower and upper case) and change it to Audio
		System.out.println(str.toLowerCase().replace("video", "Audio"));
		
		
		
		
		
		
		
		
	}
}