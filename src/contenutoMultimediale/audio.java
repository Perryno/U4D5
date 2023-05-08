package contenutoMultimediale;

public class audio extends volume {
	public audio (String titolo, int durata, int volume) {
		this.setTitolo(titolo);;
		this.setDurata(durata);
		this.setVolume(volume);;
	}
	public void playAudio() {
		String punti = generaPuntiEsclamativi(getVolume());
		String title = getTitolo();
		int numeroVolte = getDurata();
		for (int i = 0; i < numeroVolte; i++) {
			 
			 System.out.println(title + punti);
		}
	}
}
