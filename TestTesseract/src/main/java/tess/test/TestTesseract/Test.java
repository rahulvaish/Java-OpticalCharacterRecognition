package tess.test.TestTesseract;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Test {
 public static void main(String []args) {
	 Tesseract tesseract = new Tesseract();
	 try {
		tesseract.setDatapath("D:/DataScienceCollection/Jars/tessdata");
		//String text = tesseract.doOCR(new File("D:/DataScienceCollection/Images/digit.jpg"));
		//String text = tesseract.doOCR(new File("D:/DataScienceCollection/Images/RAHUL.tif"));
		//String text = tesseract.doOCR(new File("D:/DataScienceCollection/Images/removed_noise.png"));
		//String text = tesseract.doOCR(new File("D:/DataScienceCollection/Images/thres.png"));
		//String text = tesseract.doOCR(new File("D:/DataScienceCollection/Images/thres2.png"));
		//String text = tesseract.doOCR(new File("D:/DataScienceCollection/Images/2grey.png"));
		String text = tesseract.doOCR(new File("D:/DataScienceCollection/Images/CarNoPlateJavaGray.jpg"));
		
		
		
		System.out.print(text);
	 } catch (TesseractException e) {		
		e.printStackTrace();
	}
 }
}
