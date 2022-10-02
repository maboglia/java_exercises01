package riccardo.nobile.mapsproject;

public class Indirizzo {

	private String tipoVia;
	private String descrizioneVia;
	private int civico;
	
	@Override
	public int hashCode() {
	    return tipoVia.hashCode() + descrizioneVia.hashCode() + civico; // Semplice non so se corretto
	}
	
	@Override
	public boolean equals(Object other){
	    if (other == null) return false;
	    if (other == this) return true;
	    if (!(other instanceof Indirizzo))return false;
	    Indirizzo otherIndirizzo = (Indirizzo)other;
	    return
	    		this.tipoVia.equals(otherIndirizzo.tipoVia) &&
	    		this.descrizioneVia.equals(otherIndirizzo.descrizioneVia) &&
	    		this.civico == otherIndirizzo.civico;
	    		
	}
	
	
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getDescrizioneVia() {
		return descrizioneVia;
	}
	public void setDescrizioneVia(String descrizioneVia) {
		this.descrizioneVia = descrizioneVia;
	}
	public int getCivico() {
		return civico;
	}
	public void setCivico(int civico) {
		this.civico = civico;
	}
	
}
