package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Registro;
import com.example.demo.model.TipoVehiculo;

public interface IRegistroRepository extends JpaRepository<Registro, Long> {

	Optional<Registro> findByBehiculoPlacaAndActivoTrue(String placa);

	List<Registro> findByActivoTrue();

	boolean existsByVehiculoidVehiculo(Long vehiculo);

	boolean existsByVehiculoTipo(TipoVehiculo tipovehiculo);

}
