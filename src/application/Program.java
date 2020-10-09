package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Alunos;


public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Set<Alunos> alunos = new HashSet();
 		
		System.out.print("How many students course A? ");
		int n = scanner.nextInt();
		while(n > 0) {
			int id = scanner.nextInt();
			alunos.add(new Alunos(id));
			n--;
		}
		
		
		System.out.print("How many students course B? ");
		n = scanner.nextInt();
		while(n > 0) {
			int id = scanner.nextInt();
			alunos.add(new Alunos(id));
			n--;
		}
		
		
		System.out.print("How many students course C? ");
		n = scanner.nextInt();
		while(n > 0) {
			int id = scanner.nextInt();
			alunos.add(new Alunos(id));
			n--;
		}
		
		System.out.println("Total students: " + alunos.size());
		scanner.close();
	}

}
