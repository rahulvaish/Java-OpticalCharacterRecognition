This repository contains OCR implementations in Java.

### Table of Contents
  - <a href='#ocr-using-tesseract'>OCR-Tesseract</a> 
  - <a href='#ocr-using-azure-cognitive-services'>OCR-AzureCognitiveServices</a> 

<hr>

- ###### [OCR using Tesseract](https://github.com/rahulvaish/OpticalCharacterRecognition-Java/tree/Tesseract) 
   ###### This example illustrates OCR implementation using Tesseract Library. [[Source Code]](https://github.com/rahulvaish/OpticalCharacterRecognition-Java/tree/Tesseract)
   * Download eng.traineddata from https://github.com/tesseract-ocr/tessdata, in a folder named tessdata.
   * Get a sample image (Grayscale converted) with something written on it.
   * Add tess4j dependency in pom.xml
   * Follow the [sourcecode]((https://github.com/rahulvaish/OpticalCharacterRecognition-Java/tree/Tesseract)) which will read the     text/numeric written on image.
  
 <hr>

- ###### [OCR using Azure Cognitive Services](https://github.com/rahulvaish/OpticalCharacterRecognition-Java/tree/AzureCognitiveServices) 
   ###### This example illustrates OCR implementation using Microsoft Azure Cognitive Services. [[Source Code]](https://github.com/rahulvaish/OpticalCharacterRecognition-Java/tree/AzureCognitiveServices)
   * Login into Microsoft Azure
   * Create a Vision Resource
   * We get the Endpoint and keys
   * Make use of them in the [sourcecode](https://github.com/rahulvaish/OpticalCharacterRecognition-Java/tree/AzureCognitiveServices) to enjoy the OCR service from Microsoft.
