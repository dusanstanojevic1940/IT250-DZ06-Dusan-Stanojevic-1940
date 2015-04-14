package com.dusanstanojevic.MetHotels.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.tapestry5.beaneditor.NonVisual;
import org.apache.tapestry5.beaneditor.Validate;

@Entity
@Table(name="soba")
public class Soba {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonVisual
	public long id;
	
	@Validate("minlength=5")
	public String ime;
	
	public int sprat;
	
	public boolean tv;
	
	public boolean internet;
	
	public boolean djakuzi;
}
