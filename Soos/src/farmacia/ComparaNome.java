package farmacia;

import java.util.Comparator;

public class ComparaNome implements Comparator<Medicamento>{
	

	@Override
	public int compare(Medicamento med1, Medicamento med2) {
		
		return med1.getNome().compareTo(med2.getNome());
	}
	
	}


