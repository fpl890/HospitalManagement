package test;

import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import back.Appoint;
import back.Doctor;
import back.Patient;


class TestPerson {

	@Test
	void createAccount() {
		try {
			back.Person.writeInfo("TestMan", "test");
			if(!(back.Person.validUser("TestMan", "test"))) fail("Couldnt find user");
		} catch (IOException e) {
			fail("IO Exception");
		}
		
	}
	
	@Test
	void nonUser(){
		try {
			if((back.Person.validUser("asacas", "bastsa"))) fail("No valid user succeseds on non valid user");
		} catch (IOException e) {
			fail("IO Exception");
		}
	
	}
	
	@Test
	void makeDoc() {
		try {
			back.Person.writeInfo("mrDoc", "pass");
			Doctor mrDoc = new Doctor("mrDoc", "card");
			mrDoc.writeInfo();
			if(!(back.Person.validUser("mrDoc", "pass"))) fail("Couldnt find user");
			if(!Doctor.isDoc("mrDoc")) fail("doctor not added");
		} catch (IOException e) {
			fail("IO Exception");
		}
	}
	
	@Test
	void notDoc() {
		try {
			if((back.Person.validUser("notDoc", "rockbottom"))) fail("No valid user succeseds on non valid user");
			if(Doctor.isDoc("notDoc")) fail("not a real doctor reconized as doc");
		} catch (IOException e) {
			fail("IO Exception");
		}
	}
	
	@Test
	void createAppt(){
		try {
			back.Person.writeInfo("mrDoc", "pass");
			Doctor mrDoc = new Doctor("mrDoc", "card");
			mrDoc.writeInfo();
			
			Appoint.requestAppt("mrDoc", "avril", 1998, 8, 9, 10, 11);
			
			ArrayList<Appoint> appList = Doctor.generateAppointments("mrDoc");
			
			boolean found = false;
			
			for(Appoint a : appList) {
				if(a.getpName().equals("avril")) found = true;
			}
			
			if(!found)fail("couldnt look up appointment");
			
		} catch (IOException e) {
			fail("IO Exception");
		}
	}
	
	@Test
	void nonApp(){
		try {
			back.Person.writeInfo("mrDoc", "pass");
			Doctor mrDoc = new Doctor("mrDoc", "card");
			mrDoc.writeInfo();
			
			
			
			ArrayList<Appoint> appList = Doctor.generateAppointments("mrDoc");
			
			boolean found = false;
			
			for(Appoint a : appList) {
				if(a.getpName().equals("nopat")) found = true;
			}
			
			if(found)fail("found nonexistant appointment");
			
		} catch (IOException e) {
			fail("IO Exception");
		}
	}
	@Test
	void makePat() {
		try {
			back.Person.writeInfo("sicBoy", "pass");
			Patient sicBoy = new Patient("87", "sicBoy", "06/09/1998", "male", "sick", 200, 200);
			sicBoy.writeInfo();
			
			if(!Patient.getPatientName("87").equals("sicBoy")) fail("couldnt find user");
		}catch (IOException e) {
			fail("IO Exception");
		}
		
	}
	
	@Test
	void PatAll() {
		boolean correct = true;
		try {
			
			back.Person.writeInfo("sicBoy", "pass");
			Patient sicBoy = new Patient("1024", "TestAll", "06/09/1998", "male", "sick", 200, 200);
			sicBoy.writeInfo();

			if(!Patient.getPatientBirthday("1024").equals("06/09/1998")) correct = false;
			if(!(Patient.getPatientHeight("1024")==200)) correct = false;
			if(!Patient.getPatientName("1024").equals("TestAll")) correct = false;
			if(!Patient.getPatientSex("1024").equals("male")) correct = false;
			sicBoy.writeInfo();
			
			if(!correct)fail("patient not correctly saved");
		}catch (IOException e) {
			fail("IO Exception");
		}
		
	}

}
