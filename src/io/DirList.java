package io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

import utils.Print;

public class DirList {
	public static void main(String[] args) {
		File path = new File("F:\\java_workspace\\ThinkingInJava\\src");
		String[] list;
		if (args.length == 0) {
			list = path.list();
		} else {
			list = path.list(new DirFilter(args[0]));
			Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
			for(String dirItem : list) {
				Print.println(dirItem);
			}
		}
	}
}
class DirFilter implements FilenameFilter {
	private Pattern pattern;
	public DirFilter(String regex) {
		pattern = Pattern.compile(regex);
	}
	public boolean accept(File fir, String name) {
		return pattern.matcher(name).matches();
	}
}
