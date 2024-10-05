package com.documents.factories;

import com.documents.Document;
import com.documents.DocumentFactory;
import com.documents.docs.PDFDocument;

public class PDFDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}
