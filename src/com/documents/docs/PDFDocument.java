package com.documents.docs;

import com.documents.Document;

public class PDFDocument implements Document {
    @Override
    public void create() {
        System.out.println("PDF Document created.");
    }
}
