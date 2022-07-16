package com.evotixit.GestionFichiers.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import com.evotixit.GestionFichiers.models.Doc;
import com.evotixit.GestionFichiers.services.DocStorageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import static java.nio.file.Files.copy;
import static java.nio.file.Paths.get;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import static org.springframework.http.HttpHeaders.CONTENT_DISPOSITION;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("api/fichiers")
public class FichierController {
	
	@Autowired 
	private DocStorageService docStorageService;
	/* @GetMapping("/get")
		public List<Doc> getAll(Model model) {
		 return	 docStorageService.getFiles();
			 
		}*/
	 @GetMapping("/get/{groupe}")
		public List<Doc> getByGroupe(@PathVariable String groupe ) {
		 return docStorageService.getFiles(groupe);
			
		}
	  // define a location
	//+ "/Downloads/uploads/"
    public static final String DIRECTORY = System.getProperty("user.home") ;

    @PostMapping("/uploadFiles/{groupe}")
    public ResponseEntity<List<String>> uploadFiles(@PathVariable String groupe , @RequestParam("files")List<MultipartFile> multipartFiles) throws IOException {
        List<String> filenames = new ArrayList<>();
        for(MultipartFile file : multipartFiles) {
            String filename = StringUtils.cleanPath(file.getOriginalFilename());
            Path fileStorage = get(DIRECTORY, filename).toAbsolutePath().normalize();
            copy(file.getInputStream(), fileStorage, REPLACE_EXISTING);
            filenames.add(filename);
			docStorageService.saveFile(file,groupe);

        }
        return ResponseEntity.ok().body(filenames);
    }
   /* @GetMapping("downloadFile/{filename}")
    public ResponseEntity<Resource> downloadFiles(@PathVariable("filename") String filename) throws IOException {
        Path filePath = get(DIRECTORY).toAbsolutePath().normalize().resolve(filename);
        if(!Files.exists(filePath)) {
            throw new FileNotFoundException(filename + " was not found on the server");
        }
        Resource resource = new UrlResource(filePath.toUri());
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("File-Name", filename);
        httpHeaders.add(CONTENT_DISPOSITION, "attachment;File-Name=" + resource.getFilename());
        return ResponseEntity.ok().contentType(MediaType.parseMediaType(Files.probeContentType(filePath)))
                .headers(httpHeaders).body(resource);
    }
    // Define a method to download files
    @GetMapping("download/{fileId}")
	public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable Integer fileId){
    	Doc doc = docStorageService.getFile(fileId).get();
		return ResponseEntity.ok()
				.contentType(MediaType.parseMediaType(doc.getDocType()))
				.header(HttpHeaders.CONTENT_DISPOSITION,"attachment:filename=\""+doc.getDocName()+"\"")
				.body(new ByteArrayResource(doc.getData()));
    }
    
   /* @GetMapping("{groupe}")
	public String getByGroupe(@PathVariable String groupe ) {
		List<Doc> docs = docStorageService.getFiles(groupe);
		return "doc";
	}*/
   
   /* @PostMapping("/uploadFiles/{groupe}")
	public String uploadMultipleFiles(@PathVariable String groupe ,@RequestParam("files") MultipartFile[] files) {
		for (MultipartFile file: files) {
			docStorageService.saveFile(file,groupe);
			
		}
		return "redirect:/";
	}*/
/*	@GetMapping("/downloadFile/{fileId}")
	public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable Integer fileId){
		Doc doc = docStorageService.getFile(fileId).get();
		return ResponseEntity.ok()
				.contentType(MediaType.parseMediaType(doc.getDocType()))
				.header(HttpHeaders.CONTENT_DISPOSITION,"attachment:filename=\""+doc.getDocName()+"\"")
				.body(new ByteArrayResource(doc.getData()));
	}*/
	  @GetMapping("downloadFile/{filename}")
	    public ResponseEntity<Resource> downloadFiles(@PathVariable("filename") String filename) throws IOException {
	        Path filePath = get(DIRECTORY).toAbsolutePath().normalize().resolve(filename);
	        if(!Files.exists(filePath)) {
	            throw new FileNotFoundException(filename + " was not found on the server");
	        }
	        Resource resource = new UrlResource(filePath.toUri());
	        HttpHeaders httpHeaders = new HttpHeaders();
	        httpHeaders.add("File-Name", filename);
	        httpHeaders.add(CONTENT_DISPOSITION, "attachment;File-Name=" + resource.getFilename());
	        return ResponseEntity.ok().contentType(MediaType.parseMediaType(Files.probeContentType(filePath)))
	                .headers(httpHeaders).body(resource);
	    }
}
