package com.owen.junit.chapter09;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

/**
 * How can you expect certain exceptions?
 * 
 * @author OwenWilliam 2016-9-17
 *
 */
public class GeneralException
{

	@Test(expected = Exception.class)
	public void runTest() throws IOException
	{
		final Path fileSystemFile = Paths.get("/tmp/existent-file.txt");

		// incorrect usage of Paths.get
		final Path wrongFile = Paths.get("http://example.com/wrong-file");

		final long fileSize = Files.size(fileSystemFile);
		final long networkFileSize = Files.size(wrongFile);

		assertEquals(fileSize, networkFileSize);
	}
}
