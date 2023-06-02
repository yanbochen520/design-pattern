package org.designpattern.bridge;

/**
 * @Author: ybchen
 * @Date: 2023/6/2 14:28
 */
public class Client {

    public static void main(String[] args) {
        Artist artist=new Artist();
        Engineer engineer=new Engineer();
        Resource artistResource=new ArtistResource(artist);
        Resource engineerResource =new EngineerResource(engineer);
        View longFormViewOfEngineer =new LongFormView(engineerResource);
        View longFormViewOfArtist =new LongFormView(artistResource);
        View shortFormViewOfEngineer =new ShortFormView(engineerResource);
        View shortFormViewOfArtist =new ShortFormView(artistResource);
        System.out.println(longFormViewOfEngineer.show());
        System.out.println(longFormViewOfArtist.show());
        System.out.println(shortFormViewOfEngineer.show());
        System.out.println(shortFormViewOfArtist.show());

    }
}
