package com.example.ejd;

import javax.ejb.Stateless;

public class HelloBean implements HelloBeanRemote {
	public String sayHello(String name) {
        return "Hello, " + name + " from EJB!";

}
}