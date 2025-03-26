// Creating the FileReadingComparison class to find speed of file reading in filereader and inputstreamReader
import java.io.*;

public class FileReadingComparison {

    private static void readWithFileReader(String filePath) throws IOException {
        long startTime = System.currentTimeMillis();
        
        try (FileReader fr = new FileReader(filePath)) {
            int data;
            while ((data = fr.read()) != -1) {
                // Simulate processing
            }
        }
        
        long endTime = System.currentTimeMillis();
        System.out.println("FileReader Time: " + (endTime - startTime) + "ms");
    }

    private static void readWithInputStreamReader(String filePath) throws IOException {
        long startTime = System.currentTimeMillis();
        
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "UTF-8")) {
            int data;
            while ((data = isr.read()) != -1) {
                // Simulate processing
            }
        }
        
        long endTime = System.currentTimeMillis();
        System.out.println("InputStreamReader Time: " + (endTime - startTime) + "ms");
    }

    public static void main(String[] args) {
        String filePath1 = "Project Synopsis(Gen_Shop) (1) (1) (1).docx";  // Path to your large file
        String filePath2 = "33087.SQL Operators.docx";
        String filePath3 = "React.docx";
        try {
            System.out.println("Testing FileReader with smallest file...");
            readWithFileReader(filePath1);

            System.out.println("\nTesting InputStreamReader with smallest file...");
            readWithInputStreamReader(filePath1);

            System.out.println("Testing FileReader with larger file...");
            readWithFileReader(filePath2);

            System.out.println("\nTesting InputStreamReader with larger file...");
            readWithInputStreamReader(filePath2);

            System.out.println("Testing FileReader with largest file...");
            readWithFileReader(filePath3);

            System.out.println("\nTesting InputStreamReader with largest file...");
            readWithInputStreamReader(filePath3);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


// Testing FileReader with smallest file...
// FileReader Time: 450ms

// Testing InputStreamReader with smallest file...
// InputStreamReader Time: 316ms
// Testing FileReader with larger file...
// FileReader Time: 9ms

// Testing InputStreamReader with larger file...
// InputStreamReader Time: 6ms
// Testing FileReader with largest file...
// FileReader Time: 70ms

// Testing InputStreamReader with largest file...
// InputStreamReader Time: 74ms
// FileReader Time: 70ms

// Testing InputStreamReader with largest file...
// FileReader Time: 70ms

// FileReader Time: 70ms
// FileReader Time: 70ms

// Testing InputStreamReader with largest file...
// InputStreamReader Time: 74ms
