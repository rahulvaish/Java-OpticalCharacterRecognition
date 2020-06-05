package ocr.tesseract;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ImageToText {
 public static void main(String []args) {
	 Tesseract tesseract = new Tesseract();
	 try {
		tesseract.setDatapath("C:/Users/Lenovo/Downloads/OpticalCharacterRecognition-Java-Tesseract/tessdata");
		String text = tesseract.doOCR(new File("D:/DataScienceCollection/Images/digitgray.jpg"));
		System.out.print(text);
	 } catch (TesseractException e) {		
		e.printStackTrace();
	}
 }
}
