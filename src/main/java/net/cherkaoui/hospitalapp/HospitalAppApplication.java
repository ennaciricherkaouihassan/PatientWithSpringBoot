package net.cherkaoui.hospitalapp;

import net.cherkaoui.hospitalapp.Entity.Patient;
import net.cherkaoui.hospitalapp.Repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class HospitalAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(HospitalAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner start(PatientRepository patientRepository) {
        return args -> {
            Patient p1 = Patient.builder()
                    .name("Ali")
                    .DateNaissance(new Date())
                    .malade(false)
                    .score(0)
                    .build();
            Patient p2 = Patient.builder()
                    .name("Ahmed")
                    .DateNaissance(new Date())
                    .malade(false)
                    .score(0)
                    .build();
            Patient p3 = Patient.builder()
                    .name("Salah")
                    .DateNaissance(new Date())
                    .malade(false)
                    .score(0)
                    .build();

            patientRepository.save(p1);
            patientRepository.save(p2);
            patientRepository.save(p3);
            List<Patient> patients = patientRepository.findAll();
            patients.forEach(p -> {
                System.out.println(p.toString());
            });

        };
    }
}
