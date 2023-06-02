package org.designpattern.bridge;

/**
 * @Author: ybchen
 * @Date: 2023/6/2 14:20
 */
public class ArtistResource implements Resource {

    private Artist artist;

    public ArtistResource(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String snippet() {
        return artist.bio();
    }


}
