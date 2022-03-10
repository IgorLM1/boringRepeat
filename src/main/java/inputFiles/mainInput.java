package inputFiles;
import java.io.*;
import java.util.Scanner;
import outputFiles.mainOutput;

public class mainInput {

    public void readFile(String inputFile, String outputFile) throws FileNotFoundException {
        try {
            String dir = System.getProperty("user.dir");
            Scanner sc = new Scanner(new File(dir+"/files/"+inputFile));
            sc.useDelimiter(",");

            mainOutput output = new mainOutput();

            while (sc.hasNext()) {
                output.populateFile(outputFile, "dn:" + sc.next() + "");
                output.populateFile(outputFile, "changetype:");
                output.populateFile(outputFile, "replace:" );
                output.populateFile(outputFile, ":");
                output.populateFile(outputFile, "-");
                output.populateFile(outputFile, " ");
            }
            System.out.println("File populated");
            sc.close();
        } catch(Exception e){
            String className = this.getClass().getSimpleName();
            System.out.println("[FAILED] Class "+className+". Error: "+ e);
        }
    }

}
