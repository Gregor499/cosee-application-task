package com.example.demo.gallery;

import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GalleryItemService {
    private final GalleryItemRepository galleryItemRepository;

    public void addGalleryItem(GalleryItem galleryItem){
        galleryItemRepository.save(galleryItem);
    }

    public List<GalleryItem> ListAllGalleryItems(){
        return galleryItemRepository.findAll();
    }

    public Optional<GalleryItem> ListGalleryItemById(String id){
        return galleryItemRepository.findGalleryItemById(id);
    }
}
