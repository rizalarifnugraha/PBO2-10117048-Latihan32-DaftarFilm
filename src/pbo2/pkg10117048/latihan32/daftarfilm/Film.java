/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan32.daftarfilm;

/**
 *
 * @author acer
 */
public class Film {

    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;

    public void nowPlaying(String filmName, String filmGenre, double filmRating,
            int filmDuration) {
        System.out.println("====Daftar Film Sedang Tayang=====");
        System.out.println("Judul Film\t: " + filmName);
        System.out.println("Genre Film\t: " + filmGenre);
        System.out.println("Rating Film\t: " + filmRating);
        System.out.println("Duration Film\t: "+ filmDuration +" Menit");
    }

}
