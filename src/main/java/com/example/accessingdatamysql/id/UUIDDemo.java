package com.example.accessingdatamysql.id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class UUIDDemo {
	@Id
	@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
	@Column(length = 32)
	private String id;
	
	@Column
	private String name;
	@Column
	private String password;
}
