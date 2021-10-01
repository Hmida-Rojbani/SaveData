package tn.poste.save.services;

import java.io.IOException;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import tn.poste.save.documents.Photo;
import tn.poste.save.repositories.PhotoRepository;

@Service
@AllArgsConstructor
public class PhotoService {
	
	private PhotoRepository photoRepo;
	
    public String addPhoto(String title, MultipartFile file) throws IOException { 
        Photo photo = new Photo(title); 
        photo.setImage(
          new Binary(BsonBinarySubType.BINARY, file.getBytes())); 
        photo = photoRepo.insert(photo); 
        return photo.getId(); 
    }

    public Photo getPhoto(String id) { 
        return photoRepo.findById(id).get(); 
    }

}
