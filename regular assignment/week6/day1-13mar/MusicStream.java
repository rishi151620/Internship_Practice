// Music Streaming System: In a music streaming system, there may be a superclass called Song with a method called play() that plays the song's audio. Different types of songs, such as PopSong and JazzSong, may be subclasses of Song and override the play() method to play the song audio in a different way based on their specific genre and style. For example, a PopSong may play the audio with a catchy beat and chorus, while a JazzSong may play the audio with a smooth melody and improvisation.

class Song {
  String title;
  String artist;
  int duration;
    
  public void play() {
    System.out.println("Playing " + title + " by " + artist);
  }
}

class PopSong extends Song {
  public void play() {
    System.out.println("Playing " + title + " with a catchy beat and chorus by " + artist);
  }
}

class JazzSong extends Song {
  public void play() {
    System.out.println("Playing " + title + " with a smooth melody and improvisation by " + artist);
  }
}

public class MusicStreamingSystem {
  public static void main(String[] args) {
    Song song1 = new PopSong();
    song1.title = "Dynamite";
    song1.artist = "BTS";
    song1.play(); 
        
    Song song2 = new JazzSong();
    song2.title = "Take Five";
    song2.artist = "Dave Brubeck";
    song2.play();
  }
}