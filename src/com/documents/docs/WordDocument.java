package com.documents.docs;

import com.documents.Document;

public class WordDocument implements Document {
    @Override
    public void create() {
        System.out.println("Word Document created.");
    }
}
