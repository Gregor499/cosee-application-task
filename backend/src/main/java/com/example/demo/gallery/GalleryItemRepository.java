package com.example.demo.gallery;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GalleryItemRepository extends MongoRepository<GalleryItem, String> {
    Optional<GalleryItem> findGalleryItemById(String id);
}
