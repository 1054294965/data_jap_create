package com.example.accessingdatamysql.id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * @author chushiyun 2019年10月24日 下午4:41:52
 * 这里类名不要直接用table 因为table是mysql关键字  语法会错误
 */
@Entity
public class TableDemo {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Integer id;
	
	@Column
	private String name;
}
