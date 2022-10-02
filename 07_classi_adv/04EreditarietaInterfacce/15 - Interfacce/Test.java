public class Test {
	
	public static void main(String[] args) {
		// Definisco un oggetto Chitarra usando
		// un riferimento del medesimo tipo
		Chitarra c = new Chitarra("Palissandro");
		// Uso normalmente i metodi di Chitarra
		c.suona();
		c.dimmiTipoLegno();
		// Passo ad un riferimento di tipo
		// StrumentoMusicale
		StrumentoMusicale s = c;
		// Ora ho a disposizione solo suona();
		s.suona();
		// Passo ad un riferimento di tipo
		// OggettoDiLegno
		OggettoDiLegno o = c;
		// Ora ho a disposizione solo
		// dimmiTipoLegno()
		o.dimmiTipoLegno();
	}
}