package com.mjv.jpa.app;


import com.mjv.jpa.model.Musica;
import com.mjv.jpa.repository.MusicaJpaRepository;

import java.util.List;

public class PlaylistApp {
public static void main(String[]args) {

try{

    //instanciando a classe entitymanager atráves do construtor do jpa repository
    MusicaJpaRepository mjr = new MusicaJpaRepository();

    Musica musica = new Musica();
    musica.setNome("Oceans");
    musica.setAlbum("Tell Me It's Real");
    musica.setArtista("Seafret");
    musica.setDuracao(3.35);
    musica.setCompositor("Harry Draper");
    musica.setGenero("Indie");
    musica.setInternacional(true);

    Musica musica1 = new Musica();
    musica1.setNome("Atlantis");
    musica1.setAlbum("Tell Me It's Real");
    musica1.setArtista("Seafret");
    musica1.setDuracao(3.49);
    musica1.setCompositor("Harry Draper");
    musica1.setGenero("Indie");
    musica1.setInternacional(true);

    Musica musica2 = new Musica();
    musica2.setNome("Lose Control");
    musica2.setAlbum("Lose Control");
    musica2.setArtista("MEDUZA");
    musica2.setDuracao(2.48);
    musica2.setCompositor("Conor Manning");
    musica2.setGenero("House Music");
    musica2.setInternacional(true);

    Musica musica3 = new Musica();
    musica3.setNome("Tell It To My Heart");
    musica3.setAlbum("Tell It To My Heart");
    musica3.setArtista("MEDUZA");
    musica3.setDuracao(2.45);
    musica3.setCompositor("Andrew Hozier");
    musica3.setGenero("House Music");
    musica3.setInternacional(true);

    Musica musica4 = new Musica();
    musica4.setNome("Otherside of America");
    musica4.setAlbum("Otherside of America");
    musica4.setArtista("Meek Mill");
    musica4.setDuracao(3.38);
    musica4.setCompositor("Robert Williams");
    musica4.setGenero("Rap");
    musica4.setInternacional(true);

    Musica musica5 = new Musica();
    musica5.setNome("Correria");
    musica5.setAlbum("Correia");
    musica5.setArtista("BK");
    musica5.setDuracao(2.31);
    musica5.setCompositor("Abebe Bilika Costa");
    musica5.setGenero("Rap Nacional");
    musica5.setInternacional(false);

    Musica musica6 = new Musica();
    musica6.setNome("Junho de 94");
    musica6.setAlbum("O menino que queria ser deus");
    musica6.setArtista("Djonga");
    musica6.setDuracao(5.29);
    musica6.setCompositor("Djonga");
    musica6.setGenero("Rap Nacional");
    musica6.setInternacional(false);

    Musica musica7 = new Musica();
    musica7.setNome("All Star");
    musica7.setAlbum("Nando Reis - Voz e Violao - No Recreio");
    musica7.setArtista("Nando Reis");
    musica7.setDuracao(3.47);
    musica7.setCompositor("Nando Reis");
    musica7.setGenero("MPB");
    musica7.setInternacional(false);

    Musica musica8= new Musica();
    musica8.setNome("With or Without You");
    musica8.setAlbum("The Joshua Tree");
    musica8.setArtista("U2");
    musica8.setDuracao(4.56);
    musica8.setCompositor("Bono");
    musica8.setGenero("Rock");
    musica8.setInternacional(true);
    
//teste
    //realizando registros
    /*
    mjr.save(musica);
    mjr.save(musica1);
    mjr.save(musica2);
    mjr.save(musica3);
    mjr.save(musica4);
    mjr.save(musica5);
    mjr.save(musica6);
    mjr.save(musica7);
    mjr.save(musica8);

*/

    //busca por musicas por artista/album/genero

    List<Musica> playlist = mjr.findAll("Rap nacional");
    for (Musica m: playlist){
        System.out.println("----------------------");
        System.out.println(m.getNome());
    }
        System.out.println("----------------------");

    } catch (Exception e){
        e.printStackTrace();
    }

}
}