package com.evotixit.GestionFichiers.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.evotixit.GestionFichiers.models.Doc;
import com.evotixit.GestionFichiers.repository.RessourceRepository;



@Service
public class DocStorageService {
  @Autowired
  private RessourceRepository docRepository;
  
  public Doc saveFile(MultipartFile file , String groupe) {
	  String docname = file.getOriginalFilename();
	  try {
		  Doc doc = new Doc(docname,file.getContentType(),file.getBytes() );
		  doc.setGroupe(groupe); 
		  return docRepository.save(doc);
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return null;
  }
  /*public Optional<Doc> getFile(Integer fileId) {
	  return docRepository.findById(fileId);
  }
  */
  public Optional<Doc> getFile(Integer fileId) {
	  return docRepository.findById(fileId);
  }
 /* public List<Doc> getFiles(){
	  return docRepository.findAll();
  }*/
  public List<Doc> getFiles(String groupe){
	  return docRepository.findByGroupe(groupe);
  }
}
