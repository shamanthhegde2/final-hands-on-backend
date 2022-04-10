package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dao.InstituteDaoRepository;
import model.Institute;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class InstituteController {
	@Autowired
	private InstituteDaoRepository instituteRepo;
	@PostMapping("/admin/addInstitute")
	public void addInstitute(@RequestBody Institute institute) {
		instituteRepo.save(institute);
	}
	@GetMapping("/admin/viewInstitutes")
	public List<Institute> getAll(){
		return instituteRepo.findAll();
	}
	@PutMapping("/admin/editInstitute")
	public void updateInstitute(@RequestBody Institute institute) {
		instituteRepo.save(institute);
	}
}
