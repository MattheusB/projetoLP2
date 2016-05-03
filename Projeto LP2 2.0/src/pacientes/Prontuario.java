package pacientes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

public class Prontuario {
	
	private ArrayList<Paciente> prontuarios;
	private int qntdpacientes = 0;
	public Prontuario(){
	prontuarios  = new ArrayList<Paciente>();
	}
	
	public void criarPaciente(String nome, String dataDeNacimento, double peso, String tipoSanguineo, String sexo, String genero){
		this.qntdpacientes += 1;
		UUID id = UUID.randomUUID();
		Paciente novo = new Paciente(nome, dataDeNacimento, peso, tipoSanguineo, sexo, genero,id);
		
		prontuarios.add(novo);
		Collections.sort(prontuarios);
	}
	
	private Paciente verificaPaciente(UUID id){
		for(Paciente novo : prontuarios){
			if(novo.getId().equals(id)){
				return novo;
			}
		}
		
		return null;
	}
	

}
