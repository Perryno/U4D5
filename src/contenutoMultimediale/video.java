package contenutoMultimediale;

public class video extends volume implements luminosità{
	private int lumin;
	
	
	public int getLumin() {
		return lumin;
	}

	public void setLumin(int lumin) {
		this.lumin = lumin;
	}
	public void aumentaLumin() {
		setLumin(++lumin);
	}
	public void diminuisciLumin() {
		setLumin(--lumin);
	}
	public video(String titolo, int durata,int volume , int lumin) {
		this.setTitolo(titolo);;
		this.setDurata(durata);
		this.setVolume(volume);
		this.setLumin(lumin);
	}
	@Override	
	public String generaAsterischi(int lumin) {
		
	       StringBuilder sb = new StringBuilder();

	       for (int i = 0; i < lumin; i++) {
	           sb.append("*");
	       }
	  
	       return sb.toString();
	
}

	
	public void playVideo() {
		String punti = generaPuntiEsclamativi(getVolume());
		String asterix = generaAsterischi(getLumin());
		String title = getTitolo();
		int numeroVolte = getDurata();
		
		for (int i = 0; i < numeroVolte; i++) {
			 
			 System.out.println(title + punti + asterix);
		}
	}

}
