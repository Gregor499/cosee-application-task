package com.example.demo.pictureGallery;

import com.example.demo.gallery.GalleryItem;
import com.example.demo.gallery.GalleryItemRepository;
import com.example.demo.gallery.GalleryItemService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.Optional;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GalleryItemServiceTest {

    @Test
    void shouldAddNewGalleryItem(){
        //GIVEN
        File file = new File("testpath", "CHECKED");

        GalleryItem galleryItem = new GalleryItem(file, "tag1", "tag2", "tag3");

        GalleryItem expected = new GalleryItem(file, "tag1", "tag2", "tag3");

        GalleryItemRepository galleryItemRepository = mock(GalleryItemRepository.class);
        when(galleryItemRepository.save(galleryItem)).thenReturn(expected);

        GalleryItemService questionService = new GalleryItemService(galleryItemRepository);

        //WHEN
        GalleryItem actual = questionService.addGalleryItem(galleryItem);

        //THEN
        Assertions.assertThat(actual).isEqualTo(expected);
    }

}