package com.documents.test;

import com.documents.Document;
import com.documents.DocumentFactory;
import com.documents.factories.PDFDocumentFactory;
import com.documents.factories.WordDocumentFactory;

public class Main {
    public static void main(String[] args) {
        DocumentFactory pdfFactory = new PDFDocumentFactory();
        Document pdfDocument = pdfFactory.createDocument();
        pdfDocument.create();

        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDocument = wordFactory.createDocument();
        wordDocument.create();
    }
}
