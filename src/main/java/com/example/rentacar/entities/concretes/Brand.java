package com.example.rentacar.entities.concretes;


import lombok.*;

import javax.persistence.*;

@Table(name="brands")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "names")
	private String names;

}
