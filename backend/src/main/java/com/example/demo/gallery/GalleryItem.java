package com.example.demo.gallery;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "galleryItems")
@NoArgsConstructor
@AllArgsConstructor
public class GalleryItem {
    @Id
    private String id;
    private String picturePath;
    private String tag1;
    private String tag2;
    private String tag3;
}
