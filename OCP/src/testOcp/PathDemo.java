package testOcp;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
	public static void main(String[] args) {
		FileSystem fsDefault = FileSystems.getDefault();
		for (String view: fsDefault.supportedFileAttributeViews())
		System.out.println(view);
		}
}