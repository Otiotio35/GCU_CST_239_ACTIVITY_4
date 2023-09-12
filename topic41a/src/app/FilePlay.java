package app;

import java.io.*;

/**
 * The FilePlay class provides a method to copy files.
 * It uses the FileReader and FileWriter classes from the Java IO package.
 * 
  * @version 09/09/2023
 * @author toafik otiotio
 */
public class FilePlay {
	/**
	 * Default constructor for the FilePlay class.
	 */
	public FilePlay() {
	    // default constructor body (can be left empty)
	}

    /**
     * Copies the contents of one file to another.
     * 
     * @param inFile  The path to the source file.
     * @param outFile The path to the destination file.
     * @return 0 if the file was copied successfully,
     *         -1 if the source file was not found,
     *         -2 if there was an I/O error.
     */
    private static int copyFile(String inFile, String outFile) {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader(inFile);
            out = new FileWriter(outFile);

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

            in.close();
            out.close();
            return 0;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return -1;
        } catch (IOException e) {
            e.printStackTrace();
            return -2;
        }
    }

    /**
     * The main method for the FilePlay class.
     * Calls the copyFile method to copy the content of one file to another 
     * and prints out the result to the console.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        int err = FilePlay.copyFile("InUsers.txt", "OutUsers.txt");
        switch (err) {
            case 0:
                System.out.println("File was copied successfully.");
                break;
            case -1:
                System.err.println("File could not be opened.");
                break;
            case -2:
                System.err.println("File I/O error.");
                break;
        }
    }
}
