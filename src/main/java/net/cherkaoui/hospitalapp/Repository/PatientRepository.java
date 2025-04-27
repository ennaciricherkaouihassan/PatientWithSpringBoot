package net.cherkaoui.hospitalapp.Repository;


import net.cherkaoui.hospitalapp.Entity.Patient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
public interface PatientRepository extends JpaRepository<Patient, Long> {
Page<Patient> findBynameContainsIgnoreCase(String keyword, Pageable pageable);

}
