package com.gs.Albums;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gs.Albums.models.Albums;
import com.gs.Albums.models.Photos;
import com.gs.Albums.repository.AlbumRepository;
import com.gs.Albums.services.AlbumService;
import com.gs.Albums.services.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class AlbumsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlbumsApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(AlbumService albumService, PhotoService photoService) {
//		return args -> {
//			// read json and write to db
//			ObjectMapper mapper = new ObjectMapper();
//			TypeReference<List<Albums>> typeReference = new TypeReference<List<Albums>>(){};
//			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/album.json");
//			try {
//				List<Albums> albu = mapper.readValue(inputStream,typeReference);
//				albumService.saves(albu);
//				System.out.println("Albums Saved!");
//			} catch (IOException e){
//				System.out.println("Unable to save albums: " + e.getMessage());
//			}
//
////			ObjectMapper mapper = new ObjectMapper();
////			File file = new File("/Users/saichandugudala/Documents/Personal_P/Albums/src/main/java/com/gs/Albums/album.json");
////
////			try {
////				List<Albums> albu = mapper.readValue(file,new TypeReference<List<Albums>>(){});
////				albumService.saves(albu);
////				System.out.println("Albums Saved!");
////			} catch (IOException e){
////				System.out.println("Unable to save albums: " + e.getMessage());
////			}
//
//
//
//			ObjectMapper mapper1 = new ObjectMapper();
//			TypeReference<List<Photos>> typeReference1 = new TypeReference<List<Photos>>(){};
//			InputStream inputStream1 = TypeReference.class.getResourceAsStream("/json/photo.json");
//			try {
//				List<Photos> ph = mapper1.readValue(inputStream1,typeReference1);
//				photoService.saves(ph);
//				System.out.println("Photos Saved!");
//			} catch (IOException e){
//				System.out.println("Unable to save photos: " + e.getMessage());
//			}
//		};
//	}

}