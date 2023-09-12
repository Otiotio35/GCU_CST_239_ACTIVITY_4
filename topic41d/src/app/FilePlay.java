package app;

import java.io.*;

/**

 * The FilePlay class provides functionalities for file operations. This
 * particular implementation focuses on copying file contents.
 * @version 09/09/2023
 * @author toafik otiotio
 */
public class FilePlay{
	/**
	 * Default constructor for the FilePlay class.
	 */
	public FilePlay() {
	    // default constructor body (can be left empty)
	}

    /**
     * Copies content from an input file to an output file while transforming the content.
     * 
     * Each line in the input file is expected to contain values delimited by the pipe ('|') character.
     * The transformed content formats each line as: "Name is [First Name] [Last Name] of age [Age]".
     *
     * @param inFile  The path to the source file to be read.
     * @param outFile The path to the destination file where transformed content will be written.
     * @throws FileNotFoundException if the inFile does not exist, is a directory rather than a regular file,
     *         or for some other reason cannot be opened for reading.
     * @throws IOException if an I/O error occurs.
     */
    private static void copyFile(String inFile, String outFile) throws FileNotFoundException, IOException {
        BufferedReader in = null;
        BufferedWriter out = null;

        try {
            in = new BufferedReader(new FileReader(inFile));
            out = new BufferedWriter(new FileWriter(outFile));

            String line;
            while ((line = in.readLine()) != null) {
                String[] tokens = line.split("\\|");

                // Assuming at least 3 tokens: Name, Age, OtherInfo
                out.write(String.format("Name is %s %s of age %s%n", tokens[0], tokens[1], tokens[2]));
            }
        } finally {
            // Cleanup resources
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * The main execution point for the FilePlay class.
     * 
     * Reads the content of "InUsers.txt", transforms each line, and writes the 
     * transformed content to "OutUsers.txt".
     *
     * @param args Command line arguments. Not used in this method.
     */
    public static void main(String[] args) {
        try {
            copyFile("InUsers.txt", "OutUsers.txt");
            System.out.println("File was copied successfully.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File could not be opened.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File I/O error.");
        }
    }
}
