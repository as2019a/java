package com.inc.objectio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UserInputEx {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.inc"));
	User user = (User)ois.readObject();
	System.out.println(user.getId());
	System.out.println(user.getPassword());
	System.out.println(user.getName());
	}

}
