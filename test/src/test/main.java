package test;
import java.io.*;

public class main {

	public static void main(String[] args) {

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new File("_filename_")));
            String line = null;
            while((line = br.readLine()) != null) {
                // Ganze Zeile:
                // System.out.println(line);                
                String[] parts = line.split(";");
                System.out.println("Part 1" + parts[0]);
                System.out.println("Part 2" + parts[1]);
                // ...
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null) {
                try {
                    br.close();
                } catch(IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}