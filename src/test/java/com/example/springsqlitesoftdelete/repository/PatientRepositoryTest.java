package com.example.springsqlitesoftdelete.repository;

import com.example.springsqlitesoftdelete.entity.Patient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PatientRepositoryTest {
      @Autowired
      private PatientRepository patientRepository;

      private Patient patient1 = new Patient("login2", "password2");

      @Test
      void save() {
            patientRepository.save(patient1);
      }

      @Test
      void findAll() {
            List<Patient> all = patientRepository.findAll();
            System.out.println(all);
      }

      @Test
      void findAllByDeletedEquals() {
            List<Patient> allByDeletedEquals = patientRepository.findAllByDeletedEquals(true);
            System.out.println(allByDeletedEquals);
      }

      @Test
      void removePatientById() {
            patientRepository.removePatientById(1);
      }

      @Test
      void removePatientByLogin() {
            patientRepository.removePatientByLogin("login2");
      }
}