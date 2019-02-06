package com.inc.objectio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class UserOutputEx {

	public static void main(String[] args) throws IOException {
		User user = new User();
		user.setId("koreas");
		user.setPassword("@home2030");
		user.setName("이영섭");
		
		FileOutputStream fos = new FileOutputStream("user.inc");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(user);
		
	}

}
