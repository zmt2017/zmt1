package test;

import java.lang.reflect.Type;

import domain.User;
import interfacep.Userdao;

public class test {
	public static void main(String[] args) {
		Userdao user = new Userdao();
		user.save(new User());
	}
}
