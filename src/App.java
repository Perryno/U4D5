import contenutoMultimediale.immagine;
import contenutoMultimediale.video;
import contenutoMultimediale.audio;
public class App {


	
	public static void main(String[] args) {
		video a = new video("primo video",2,3,4);
		video r = new video("primo video",2,6,4);
		audio b = new audio("primo audio",1,2);
		immagine c = new immagine("prima immagine",8);
		
		a.playVideo();
		r.playVideo();
		b.playAudio();
		b.aumentaVolume();
		b.diminuisciVolume();
		b.playAudio();
		a.aumentaVolume();
		a.playVideo();
		a.diminuisciLumin();
		a.diminuisciVolume();
		a.playVideo();
		c.show();
		
	}
	
	}
	

	

