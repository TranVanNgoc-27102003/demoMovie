package com.poly.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "nhanvien")
public class nhanvien implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer manv;
//	@NotBlank(message = "{vui lòng nhập họ tên}")
	String hoten;
	String email;
	Integer sdt;
	String diachi;
	String anh;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	@Column(name = "ngayvaolam")
	Date ngayvaolam = new Date(); 
	boolean trangthai;
	@ManyToOne
	@JoinColumn(name = "matk")
	taikhoan matk;
	Integer chucvu;
}
