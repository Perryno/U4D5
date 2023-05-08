package contenutoMultimediale;

public abstract class volume extends riproducibile {
	
private int volume;

public int getVolume() {
	return volume;
}

public void setVolume(int volume) {
	this.volume = volume;
}

	public void aumentaVolume() {
		setVolume(++volume);
	}
	public void diminuisciVolume() {
		setVolume(--volume);
	}
   public static String generaPuntiEsclamativi(int numero) {
       StringBuilder sb = new StringBuilder();

       for (int i = 0; i < numero; i++) {
           sb.append("!");
       }
  
       return sb.toString();
}
}
