package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Vehiculo;

import jakarta.persistence.LockModeType;

public interface IVehiculoRepository extends JpaRepository<Vehiculo, Long> {

	Optional<Vehiculo> findByPlaca(String placa);

	boolean existsByPlaca(String placa);

	@Query("SElECT v FROM  Vehiculo v WHERE v.placa = : placa")
	@Lock(LockModeType.PESSIMISTIC_WRITE)
	Optional<Vehiculo> findByPlacaForUpdate(String placa);

}
