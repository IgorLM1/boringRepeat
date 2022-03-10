import inputFiles.mainInput;
import outputFiles.mainOutput;
import java.io.FileNotFoundException;

public class main {

    public static void main(String[] args) throws FileNotFoundException {
        // Insert the name of the file that will be create.
        mainOutput output = new mainOutput();
        System.out.println(output.createFile("<createOutputFile>"));

        // Insert the name of file that will be read and the name of the output file.
        // The file to be read need to be in "files" folder in this project.
        mainInput readFiles = new mainInput();
        readFiles.readFile("<inputFile>", "<outputFile>");
    }

}
