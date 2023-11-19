import java.io.*;

public class Countfile_21{
    public static void main(String[] args) throws IOException {
        File file = new File("word.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int characterCount = 0;
        int lineCount = 0;

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            characterCount += line.length();
            lineCount++;
        }

        System.out.println("Number of characters: " + characterCount);
        System.out.println("Number of lines: " + lineCount);

        bufferedReader.close();
    }
}

