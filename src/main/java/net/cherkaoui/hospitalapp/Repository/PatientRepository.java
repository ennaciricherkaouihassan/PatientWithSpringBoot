package net.cherkaoui.hospitalapp.Repository;


import net.cherkaoui.hospitalapp.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {


}
