package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dao.AcademyDaoRepository;
import model.Academy;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class AcademyController {
	@Autowired
	AcademyDaoRepository academyRepo;
	@GetMapping("/academies")
	public List<Academy> getAllAcademies(){
		return academyRepo.findAll();
	}
	@PostMapping("/academies")
	public void addAcademies(@RequestBody Academy academy) {
		academyRepo.save(academy);
	}
}
