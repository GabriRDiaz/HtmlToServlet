package grd.utils.HtmlToServlet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ServletWriter {
	public static void writeServlet(ArrayList<String> code) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\code.txt"));
		code.forEach(l->{
			try {
				bw.write("out.println(\""+l+"\");\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		bw.flush();
		bw.close();
	}
}
