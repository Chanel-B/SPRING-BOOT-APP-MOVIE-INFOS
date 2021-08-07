package com.chanel.moviecategoryservice.controller;

import com.chanel.moviecategoryservice.model.CatalogItem;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/catalog")
public class CatalogItemController {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(String userId){
        return Collections.singletonList(
          new CatalogItem("Transform", "Test", 4)
        );
    }
}
