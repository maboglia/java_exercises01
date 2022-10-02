package it.itiscastelli.bolloauto4;

public class Automobile extends VeicoloMotorizzato {
	int posti;
	
	enum Classe {
		Euro0, Euro1, Euro2, Euro3, Euro4, Euro5
	};

	enum Regione {
		Basilicata, Bolzano, Friuli, EmiliaRomagna, Lazio, Lombardia, Molise // non le metto tutte,  troppo lungo da fare
	};

	Classe classe; 
	Regione regione;
	int potenza;
	
	double bollo() {
		switch(regione) {
		case Basilicata:
		case Bolzano:
		case Friuli:
		case EmiliaRomagna:
		case Lazio:
		case Lombardia:
		  if (potenza > 100){
	            switch (classe){
	                case Euro0:
	                    return potenza * 4.50;
	                case Euro1:
	                    return potenza * 4.35;
	                case Euro2:
	                    return potenza * 4.20;
	                case Euro3:
	                    return potenza * 4.05;
	                case Euro4:
	                case Euro5:
	                	return potenza * 3.87;
	            }
	      }

		 if (potenza > 0 && potenza <= 100) {
	            switch (classe){
	                case Euro0:
	                    return potenza * 3.0;
	                case Euro1:
	                    return potenza * 2.90;
	                case Euro2:
	                    return potenza * 2.80;
	                case Euro3:
	                    return potenza * 2.70;
	                case Euro4:
	                case Euro5:
	                	return potenza * 2.58;
	            }
	     }

		 break;
		case Molise:
		 if (potenza > 100){
			    switch (classe){
			        case Euro0:
			            return potenza * 4.82;
			        case Euro1:
			            return potenza * 4.65;
			        case Euro2:
			            return potenza * 4.49;
			        case Euro3:
			            return potenza * 4.33;
			        case Euro4:
			        case Euro5:
			            return potenza * 4.14;
			     }
		}

		if (potenza > 0 && potenza <= 100) {
			     switch (classe){
			        case Euro0:
			            return potenza * 3.21;
			        case Euro1:
			            return potenza * 3.1;
			        case Euro2:
			            return potenza * 3.0;
			        case Euro3:
			            return potenza * 2.89;
			        case Euro4:
			        case Euro5:
			            return potenza * 2.76;
			     }
		}
		break;

		//  troppo lungo da scrivere, mi fermo

		} // fine switch

		return 0.0;

	} // fine metodo bollo

	public Automobile(String targa, String modello, Classe classe, int potenza, Regione regione) {
		super(targa, modello);
		super.ruote = 4;
		this.classe = classe;
		this.potenza = potenza;
		this.regione = regione;
	}

	@Override 
	public String toString() {
		return super.toString() + ", classe " + classe + ", potenza " + potenza + ", regione " +regione +" kw, bollo " + bollo() + " euro. Proprietario con codice fiscale " + super.proprietario.codiceFiscale;
	}
	
}
