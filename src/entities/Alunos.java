package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.Cursos;

public class Alunos {
	private int IDAluno;
	private List<Cursos> cursos = new ArrayList<Cursos>();
	
	public Alunos() {
		
	}

	public Alunos(int iDAluno) {
		IDAluno = iDAluno;
	}

	public List<Cursos> getCursos() {
		return cursos;
	}

	public void setCursos(Cursos cursos) {
		this.cursos.add(cursos);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + IDAluno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alunos other = (Alunos) obj;
		if (IDAluno != other.IDAluno)
			return false;
		return true;
	}
	
}
