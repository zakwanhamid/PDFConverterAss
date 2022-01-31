import java.io.File;
import java.io.IOException;
import java.io.FileWriter;   // Import the FileWriter class


import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Main {
    public static void CreateFile(String name) {
        try {
            File myObj = new File("converted/"+ name + "_Convert.txt");
            if (myObj.createNewFile()) {
            } else {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void WriteToFile(String name, String dat) {
        try {
            FileWriter myWriter = new FileWriter("converted/"+ name + "_Convert.txt");
            myWriter.write(dat);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args)throws IOException {

        if (args.length != 0)
        {
            String filename = args[0];
            //Loading an existing document
            File file = new File("upload/" + filename + ".pdf");
            PDDocument doc = PDDocument.load(file);

            //Instantiate PDFTextStripper class
            PDFTextStripper pdfStripper = new PDFTextStripper();

            //Retrieving text from PDF document
            String text = pdfStripper.getText(doc);

            //Closing the document
            doc.close();

            CreateFile(filename);
            WriteToFile(filename,text);
        }


    }
}
