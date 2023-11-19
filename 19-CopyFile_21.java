import java.io.*;

public class CopyFile_21 {
    public static void main(String[] args) throws IOException {
        File originalFile = new File("original.txt");
        FileInputStream fileInputStream = new FileInputStream(originalFile);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        File copyFile = new File("copy.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(copyFile);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();

        System.out.println("Contents of original.txt have been copied to copy.txt");
    }
}

