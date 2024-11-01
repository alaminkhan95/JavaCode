package master;

import java.io.*;

public class FileDataReaderWriter {

    public static void main(String[] args) throws IOException {
        fileDataReader();
        fileDataWriter();
    }

    public static void fileDataReader() throws IOException {

        try {
        FileReader fileReader = new FileReader("/Users/alaminkhan/Downloads/New.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        }catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
}

    public static void fileDataWriter() throws IOException {

            FileWriter fileWriter = new FileWriter("/Users/alaminkhan/Downloads/New.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.newLine();
            bufferedWriter.write("Adiba is my daughter");

            bufferedWriter.close();

    }



}
