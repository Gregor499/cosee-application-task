package com.example.demo;

import com.example.demo.gallery.GalleryItem;
import com.example.demo.gallery.GalleryItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GalleryController {
    private final GalleryItemService galleryItemService;

    @PostMapping("/data")
    @ResponseBody
    void addGalleryItem(GalleryItem galleryItem) {
        galleryItemService.addGalleryItem(galleryItem);
    }

    @GetMapping("data")
    List<GalleryItem> getGalleryItems(){
        return galleryItemService.ListAllGalleryItems();
    }

    @GetMapping("data")
    GalleryItem getGalleryItem(String id){
        return galleryItemService.ListGalleryItemById(id).orElseThrow();
    }

}
