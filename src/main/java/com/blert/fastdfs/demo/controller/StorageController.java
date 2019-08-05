package com.blert.fastdfs.demo.controller;

import com.github.tobato.fastdfs.service.AppendFileStorageClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {

    @Autowired
    private AppendFileStorageClient storageClient;


}
