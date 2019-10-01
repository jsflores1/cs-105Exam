package edu.sbcc.cs105;

import java.text.SimpleDateFormat;
import java.util.*;

public class Program {

	public static void main(String[] args) {

		Calendar today;
		String output;
		SimpleDateFormat formatter;

		String pattern = "yyyy-MM-dd";
		formatter = new SimpleDateFormat(pattern);
		today = Calendar.getInstance();
		output = formatter.format(today.getTime());
		System.out.println(pattern + " " + output);

	}

}
