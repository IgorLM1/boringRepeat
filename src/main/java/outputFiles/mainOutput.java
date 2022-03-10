package outputFiles;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class mainOutput {
    public String createFile(String fileName){
        String dir = System.getProperty("user.dir");
        File file = new File(dir + "/files/"+fileName);
        boolean result;
        try {
            result = file.createNewFile();
            return result  ? "File created " + file.getCanonicalPath() : "File already exist " + file.getCanonicalPath();
        } catch (Exception e){
            String className = this.getClass().getSimpleName();
            return "[FAILED] Class "+className+". Error: "+ e;

        }
    }

    public void populateFile(String fileName, String lineToWrite) throws IOException {
        String dir = System.getProperty("user.dir");
        try {
            FileOutputStream fos = new FileOutputStream(dir + "/files/"+fileName, true);
            byte[] b = lineToWrite.getBytes(StandardCharsets.UTF_8);
            fos.write(b);
            fos.write(10);
            fos.close();
        }catch (Exception e){
            String className = this.getClass().getSimpleName();
            System.out.println("[FAILED] Class "+className+". Error: "+ e);
        }
    }
}
