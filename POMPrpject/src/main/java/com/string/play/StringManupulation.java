package com.string.play;

import org.junit.Test;

public class StringManupulation {
	
	@Test
	public void play()
	{
		
		String s="how are you";
		String s1= new String("how are you");
		s.charAt(4);
		System.out.println("How".compareTo("How"));
		s.concat("doing");
		s.contains("s1");
		s.endsWith("you");
		s.equals(s1);
		s.equalsIgnoreCase(s1);
		int i=s1.hashCode();
		int i1=s1.hashCode();
		System.out.println(i);
		int x=s.indexOf('o');
		int x1=s1.indexOf('a', x+1);
		s.isEmpty();
		int y=s.lastIndexOf('o');
		s.lastIndexOf('o', y-1);
		s.length();
		s.replace("how", "who");
		String q[]=s.split(" ");
		s.startsWith("how");
		System.out.println(s.substring(4));
		s.substring(4, 7);
		s.toLowerCase();
		s.toUpperCase();
		s.toString();
		s.valueOf(6);
		s.trim();
		StringBuffer sb= new StringBuffer("how are you");
		sb.append("doing");
		System.out.println(s);
		System.out.println(sb);
		
	}

}
