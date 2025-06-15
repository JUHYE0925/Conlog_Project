package com.conlog.content.model.service;

import com.conlog.content.model.dao.ContentMapper;
import org.springframework.stereotype.Service;

@Service
public class ContentService {

    private final ContentMapper contentMapper;

    public ContentService(ContentMapper contentMapper){
        this.contentMapper = contentMapper;
    }
}
