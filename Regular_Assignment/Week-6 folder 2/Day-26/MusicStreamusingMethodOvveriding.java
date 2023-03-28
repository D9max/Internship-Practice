//Music Streaming System: In a music streaming system, there may be a superclass called Song with a method called play() that plays the song's audio. Different types of songs, such as PopSong and JazzSong, may be subclasses of Song and override the play() method to play the song audio in a different way based on their specific genre and style. For example, a PopSong may play the audio with a catchy beat and chorus, while a JazzSong may play the audio with a smooth melody and improvisation.

class Song {

  public void play() {
    System.out.println("Playing song audio");
  }
}

class PopSong extends Song {
  public void play() {
    System.out.println("Playing PopSong audio with a catchy beat and chorus");
  }
}

class JazzSong extends Song {
  public void play() {
    System.out.println("Playing JazzSong audio with a smooth melody and improvisation");
  }
}

public class MusicStreamusingMethodOvveriding {
  public static void main(String[] args) {
    Song song = new Song();
    PopSong popSong = new PopSong();
    JazzSong jazzSong = new JazzSong();
    song.play();
    popSong.play();
    jazzSong.play();
  }
}
