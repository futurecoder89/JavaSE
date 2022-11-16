package day03.loop;
/*
 * 2. do ~ while()문
 * 
 * do{
 * 	반복수행할 코드
 * }while(조건문);
 * 
 * 
 */

public class Mainclass02 {
	public static void main(String[] args) {
		int count = 0;
		do {
			System.out.println(count);
			count++;
		}while(count < 100);
	}

}
