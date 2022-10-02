package riccardo.nobile.mapsproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.GeocodingApiRequest;
import com.google.maps.PendingResult;
import com.google.maps.model.GeocodingResult;

public class App {
    public static void main(String[] args) {
    	String apiKey = "";
    	int start = 0;
    	int end = 0;
    	String inputFile = "";
    	String outputFile = "";
    	try {
    		apiKey = args[0];
        	start = Integer.parseInt(args[1]);
        	end = Integer.parseInt(args[2]);
        	inputFile = args[3];
        	outputFile = args[4];
    	} catch(Exception e) {
    		System.out.println("Inserisci i parametri: apiKey, start, end, inputFile, outputFile");
    	}
    	
    	FileReader fr = null;
    	try {
    		fr = new FileReader(inputFile);
    	} catch(Exception e) {
    		System.out.println("Verificare che il file/persorso inserito esista e sia corretto");
    	}
    	
    	BufferedReader br = null;
    	try {
    		br = new BufferedReader(fr);
    	} catch(Exception e) {
    		System.out.println("Errore nella creazione del buffer di lettura");
    		closeReadFile(fr);
    	}
    	
    	
    	Map<Indirizzo, List<Integer>> attivita = new HashMap<>();
		
		try {
			String row = new String();
			row = br.readLine();
			while((row = br.readLine()) != null) {
				String[] items = row.split(",");
				
				try {
				
					int id = Integer.parseInt(items[0]);
					
					try {
						Indirizzo indirizzo = new Indirizzo();
						indirizzo.setTipoVia(items[3]);
						indirizzo.setDescrizioneVia(items[4]);
						indirizzo.setCivico(Integer.parseInt(items[5]));
						
						List<Integer> ids = new ArrayList<>();
						
						if(attivita.containsKey(indirizzo)) {
							ids = attivita.get(indirizzo);
						}
						
						ids.add(id);
						attivita.put(indirizzo, ids);
					} catch (Exception e) {
						System.out.println("Trovati dati non corretti per ID: " + id);
					}
				} catch (Exception e) {
					System.out.println("Trovato riga non conforme");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	

    	
    	
    	// Chiusura risorse lettura
    	closeReadBuffer(br);
    	closeReadFile(fr);
    	
    	// AIzaSyA2QwulRqagBhyyqIDLPHCFouBbS-eVBqY
    	GeoApiContext context = new GeoApiContext().setApiKey(apiKey);
    	
    	// leggo dal buffer da start ad end e chiamo la funzione req con callback.
    	
    	
    	GeocodingApiRequest req = GeocodingApi.newRequest(context).address("Via Giulio Cesare, 12");
    	req.setCallback(new PendingResult.Callback<GeocodingResult[]>() {
    		
    		@Override
    		public void onResult(GeocodingResult[] result) {
    			// Handle successful request.
    		}

    		@Override
    		public void onFailure(Throwable e) {
    			// Handle error.
    		}
		});
    	
    	FileWriter fw = null;
    	try {
    		fw = new FileWriter(outputFile);
    	} catch (Exception e) {
    		System.out.println("Verificare che il file/persorso inserito esista e sia corretto");
    	}
		
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(fw);
		} catch (Exception e) {
			System.out.println("Verificare che il file/persorso inserito esista e sia corretto");
			closeWriteFile(fw);
		}
		
		// Scrittura sul file
		// Write untile there is data
		pw.println();
		
		// Chiusura risorse file scrittura
		closeWrite(pw);
		closeWriteFile(fw);
    }
    
    public static void closeReadFile(FileReader fr) {
    	try {
    		fr.close();
    	} catch(Exception e) {
    		System.out.println("Errore nella chiusura del file");
    	}
    }
    
    public static void closeReadBuffer(BufferedReader br) {
    	try {
    		br.close();
    	} catch(Exception e) {
    		System.out.println("Errore nella chiusura del file");
    	}
    }
    public static void closeWriteFile(FileWriter fw) {
    	try {
    		fw.close();
    	} catch(Exception e) {
    		System.out.println("Errore nella chiusura del file");
    	}
    }
    
    public static void closeWrite(PrintWriter pw) {
    	try {
    		pw.close();
    	} catch(Exception e) {
    		System.out.println("Errore nella chiusura del file");
    	}
    }
}
