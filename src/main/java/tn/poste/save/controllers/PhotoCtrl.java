package tn.poste.save.controllers;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import tn.poste.save.documents.Photo;
import tn.poste.save.dto.PhotoData;
import tn.poste.save.services.PhotoService;

@RestController
@AllArgsConstructor
public class PhotoCtrl {
	
	private PhotoService service;
	
	
	@GetMapping("/photo/{id}")
	public Photo getPhotoById(@PathVariable("id") String id) {
		return service.getPhoto(id);
	}
	
	@PostMapping("/photo/add")
	public void addPhoto(@RequestBody PhotoData data) {
		try {
			service.addPhoto(data.getTitle(), data.getImage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
