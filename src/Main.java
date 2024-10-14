import song.Music;
import song.Podcast;

public class Main {
    public static void main(String[] args) {

        Music music = new Music();
        Podcast podcast = new Podcast();

        music.setTitle("Born from Pain");
        music.setGender("Metal");
        music.setAlbum("Destroy the Machines");
        music.setClassification(5);
        music.setSinger("Earth Crisis");

        for (int i = 0; i < 1200 ; i++) {
            music.reproduces();
        }
        for (int i = 0; i < 150; i++) {
            music.like();
        }

        podcast.setTitle("Hipsters ponto tech");
        podcast.setPresenter("Paulo Silveira");
        podcast.setClassification(5);
        podcast.setDescription("O Hipsters Ponto Tech é o podcast onde o pessoal da Caelum e da Alura entra em discussões acaloradas sobre programação, design, ux, gadgets, startups e as últimas modinhas em tecnologia. ");

        for (int i = 0; i < 500; i++) {
            podcast.reproduces();
        }
        for (int i = 0; i < 100; i++) {
            podcast.like();
        }


        System.out.println("Nome da banda: " + music.getSinger());
        System.out.println("Nome da música: " + music.getTitle());
        System.out.println("Álbum que está a música: " + music.getAlbum());
        System.out.println("Gênero de música: " + music.getGender());
        System.out.println("Avaliação: " + music.getClassification());
        System.out.println("Quantidade de likes: " + music.getTotalLikes());
        System.out.println("Quantidade de reproduções: " + music.getTotalReproductions());
        System.out.println();
        System.out.println("Nome do Podcast: " + podcast.getTitle());
        System.out.println("Nome do apresentador: " + podcast.getPresenter());
        System.out.println("Descrição do Podcast: " + podcast.getDescription());
        System.out.println("Avaliação: " + podcast.getClassification());
        System.out.println("Quantidade de likes: " + podcast.getTotalLikes());
        System.out.println("Quantidade de reproduções: " + podcast.getTotalReproductions());



    }
}