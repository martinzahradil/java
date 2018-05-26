package cz.isonsoft.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Nio {

	public void jenniferReads(Path p) throws IOException {
		Files.lines(p);
		}
		public void jonReads(Path p) throws IOException {
		Files.readAllLines(p);
		}
		public static void main(String[] pages) throws IOException {
		Path p = Paths.get("/bookshelf/mobydick.txt");
		final Nio r = new Nio();
		r.jenniferReads(p);
		r.jonReads(p);
		}

}
