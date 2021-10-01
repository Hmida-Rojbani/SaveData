package tn.poste.save.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import tn.poste.save.documents.Photo;

public interface PhotoRepository extends MongoRepository<Photo, String>{

}
