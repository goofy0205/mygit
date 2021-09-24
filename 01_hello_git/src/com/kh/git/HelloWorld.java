package com.kh.git;

import com.kh.animal.Cat;
import com.kh.animal.Dog;
import com.kh.foo.Foo;
/**
 * 
 * 원격 저장소 push check
 *
 */
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("Hello git!");
		System.out.println("Good luck");
		new Foo().sayFoo();
		new Foo().sayFoo();//#sayFoo에서 추가
		System.out.println("lucky");//#master에서 추가
		new Cat().catsay();
		new Dog().dogsay();
	}

}
