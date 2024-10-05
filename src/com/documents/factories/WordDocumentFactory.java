package com.documents.factories;

import com.documents.Document;
import com.documents.DocumentFactory;
import com.documents.docs.WordDocument;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
