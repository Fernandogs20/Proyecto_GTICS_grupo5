package com.example.project.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.project.entity.Usuarios;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {


}
