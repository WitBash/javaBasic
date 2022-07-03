package com.boshko.lesson6.extra.service;

import com.boshko.lesson6.extra.dao.Document;

import java.util.List;

public interface Service {
    Document create(Integer pageCount, String format, Boolean isEditable);

    Document read(Long id);

    Document update(Document document);

    void delete (Long id);

    List<Document> getDocuments();
}
