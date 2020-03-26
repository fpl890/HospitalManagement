package test;

import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import org.junit.jupiter.api.Test;


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

}
