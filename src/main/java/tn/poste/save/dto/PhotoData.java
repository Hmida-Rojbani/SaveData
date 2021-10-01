package tn.poste.save.dto;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class PhotoData {
	
	private String title;
	
	private MultipartFile image;

}
