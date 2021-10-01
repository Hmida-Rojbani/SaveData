package tn.poste.save.documents;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Document(collection = "photos")
@Data
public class Photo {
	@Id
	private String id;
	
	private String title;
	
	private Binary image;

	public Photo(String title) {
		super();
		this.title = title;
	}
	

}
