package com.boshko.lesson6.extra.repository.impl;

import com.boshko.lesson6.extra.dao.Document;
import com.boshko.lesson6.extra.repository.DocumentRepository;

import java.util.ArrayList;
import java.util.List;

public class DocumentRepositoryImpl implements DocumentRepository {
    private List<Document> documents = new ArrayList<>();
    private static long id = 1;

    {
        Document csv = new Document(12, "csv", true);
        csv.setId(id++);
        this.documents.add(csv);
    }

    @Override
    public Document findBy(Long id) {
        Document document = null;
        for (Document doc : documents) {
            if (doc.getId().equals(id)) {
                document = doc;
            }
        }
        return document;
    }

    @Override
    public void save(Document document) {
        Document doc = findBy(document.getId());
        if (doc != null) {
            delete(doc.getId());
        } else {
            document.setId(id++);
        }
        this.documents.add(document);
    }

    @Override
    public void delete(Long id) {
        Document doc = findBy(id);
        if (doc != null) {
            documents.remove(doc);
        } else {
            System.err.printf("Document with id: %d is not found", id);
        }
    }

    @Override
    public List<Document> getDocuments() {
        return documents;
    }
}
