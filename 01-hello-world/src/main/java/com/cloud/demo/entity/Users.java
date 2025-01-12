package com.cloud.demo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Users {
	
	private String firstName;
	private String secondName;
}
