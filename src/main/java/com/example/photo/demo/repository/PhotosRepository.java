package com.example.photo.demo.repository;

import com.example.photo.demo.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotosRepository extends CrudRepository<Photo, Integer> {

}
