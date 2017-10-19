
import java.io.*;
import net.sourceforge.tess4j.*;

public class Main1 {
public static String patch1;
public static String res1;
    public static void main(String[] args) {

        File imageFile;
            imageFile = new File(patch1);
        //File imageFile = new File(patch1);
        Tesseract instance = Tesseract.getInstance(); //
        
        try {
            instance.setLanguage("rus");
            String result = instance.doOCR(imageFile);
            res1=result;
            System.out.println(res1);
            //NewJFrame text1= new NewJFrame();
            //text1.jTextField1.setText(result);
            //text1.setVisible(true);
            
            
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}
