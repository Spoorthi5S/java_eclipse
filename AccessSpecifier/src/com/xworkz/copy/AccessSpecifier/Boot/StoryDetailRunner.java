package com.xworkz.copy.AccessSpecifier.Boot;

import com.xworkz.copy.AccessSpecifier.*;

public class StoryDetailRunner {

	public static void main(String[] args) {
Stories story=new Stories();
		
		
		System.out.println(story.getBookName());
		System.out.println(story.getWriter());
		System.out.println(story.getReleasedYear());
		System.out.println(story.getBookColour());
		System.out.println(story.getPrice());
		System.out.println(story.isBookQuality());
		System.out.println(story.getNoOfPages());
		System.out.println(story.getNoOfchapters());
		System.out.println(story.getLanguage());
		System.out.println(story.isIntresting());
		System.out.println(story.getTypeOfNovel());
		
		
		StoryDetail modify = new StoryDetail();
		modify.modifyNovel(story);
	}

	}


