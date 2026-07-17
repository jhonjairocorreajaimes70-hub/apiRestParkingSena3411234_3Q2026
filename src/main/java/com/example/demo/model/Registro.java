package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "registro")
public class Registro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idRegistro;
	@Column(nullable = false)
	private LocalDate fechaHoraIngreso;
	private LocalDate fechaHoraSalida;
	private Double valorPagado;
	@Column(nullable = false)
	private Boolean activo = true;

	@ManyToOne
	@JoinColumn(name = "idVerhiculo", nullable = false)
	private Vehiculo vehiculo;
}
