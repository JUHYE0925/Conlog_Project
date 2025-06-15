package com.conlog.content.controller;

import com.conlog.content.model.service.ContentService;
import org.springframework.stereotype.Controller;

@Controller
public class ContentController {

    private final ContentService contentService;

    public ContentController(ContentService contentService){
        this.contentService = contentService;
    }

}
