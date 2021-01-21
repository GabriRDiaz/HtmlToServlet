package grd.utils.HtmlToServlet;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		ServletWriter.writeServlet(HtmlReader.readHtml());
	}

}
