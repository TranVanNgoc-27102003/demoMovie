package com.poly.entity;



import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="phim")
public class phim {
	@Id
	@Column(name="maphim")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer maphim;
	
	@Column(name="tenphim")
	private String tenphim;
	
	@Column(name="ngaysanxuat")
	private Date ngaysanxuat;
	
	@Column(name="hinhanh")
	private String hinhanh;
	
	@Column(name="quocgia")
	private String quocgia;
	
	@Column(name="thoiluong")
	private Integer thoiluong;
	
	@Column(name="href")
	private String href;

}
