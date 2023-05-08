package contenutoMultimediale;

public class immagine extends nonRiproducibile implements luminosità {
	int lumin;
	public immagine(String titolo,int lumin) {
		this.setTitolo(titolo);
		this.lumin = lumin;
	
	}
	@Override
	public String generaAsterischi(int numero) {
		  StringBuilder sb = new StringBuilder();

	       for (int i = 0; i < lumin; i++) {
	           sb.append("*");
	       }
	  
	       return sb.toString();
	}
	
	public void show() {
	
		String asterix = generaAsterischi(lumin);
		String title = getTitolo();
	
		
			 
			 System.out.println(title + asterix);
		
	
	}
	
}
