package ar.edu.unlp.info.oo2.Ejercicio3_MediaPlayer;

public class MediaStream extends Media{
	private VideoStream videoStream;
	
	
	@Override
	public void Play() {
		this.videoStream.Reproduce();
	}

}
