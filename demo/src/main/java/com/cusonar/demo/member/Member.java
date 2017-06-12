package com.cusonar.demo.member;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Member implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4001289570866034403L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String username;
	private String remark;
}
