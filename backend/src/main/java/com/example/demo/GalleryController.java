package com.example.demo;

import com.example.demo.gallery.GalleryItem;
import com.example.demo.gallery.GalleryItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class GalleryController {
    private final GalleryItemService galleryItemService;

    @PostMapping("/pictureData")
    @ResponseBody
    GalleryItem addGalleryItem(GalleryItem galleryItem) {
        galleryItemService.addGalleryItem(galleryItem);
        return galleryItemService.ListGalleryItemById(galleryItem.getId()).orElseThrow();
    }

    @GetMapping("/pictureData")
    List<GalleryItem> getGalleryItems() {
        return galleryItemService.ListAllGalleryItems();
    }


}
