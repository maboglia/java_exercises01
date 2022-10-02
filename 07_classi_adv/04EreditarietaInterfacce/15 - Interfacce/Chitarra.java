public class Chitarra implements StrumentoMusicale, OggettoDiLegno {
	
	private String tipoLegno;
	
	public Chitarra(String tipoLegno){
		this.tipoLegno = tipoLegno;
	}
	
	//Richiesto da StrumentoMusicale
	public void suona(){
		System.out.println("Do Re Mi Fa Sol La Si");
	}
	
	//Richiesto da OggettoDiLegno
	public void dimmiTipoLegno(){
		System.out.println(tipoLegno);
	}
}