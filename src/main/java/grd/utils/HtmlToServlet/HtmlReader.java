package grd.utils.HtmlToServlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class HtmlReader {
	private static ArrayList<String> code = new ArrayList<String>();
	
	public static ArrayList<String> readHtml() throws IOException {
		BufferedReader br = Files.newBufferedReader(Paths.get("D:\\test.html"));
		Stream<String> lines = br.lines();
		
		lines.forEach(l->{
			code.add(l.trim());
		});
		return code;
	}

	public static ArrayList<String> getCode() {
		return code;
	}
	
}
