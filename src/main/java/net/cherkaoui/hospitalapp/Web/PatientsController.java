package net.cherkaoui.hospitalapp.Web;

import org.springframework.ui.Model;
import net.cherkaoui.hospitalapp.Entity.Patient;
import net.cherkaoui.hospitalapp.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PatientsController {
    @Autowired
    private PatientRepository patientRepository;
    @GetMapping ("/index")
    public String index(Model model) {
        List<Patient> patients = patientRepository.findAll();
        model.addAttribute("patients", patients);
        return "patients";
    }
    @GetMapping ("/deletepatients")
    public String deletePatient(@RequestParam(name="id")Long id) {
        patientRepository.deleteById(id);
        return "redirect:/index";
    }
}
