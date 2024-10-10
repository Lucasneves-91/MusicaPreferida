public class Main {
    public static void main(String[] args) {

        Audio audio = new Audio();

        audio.setTitle("Firestorm");
        audio.setTotalReproductions(589);
        audio.setClassification(5);
        audio.setTotalLikes(1578);

        System.out.println("Nome da música: " + audio.getTitle());
        System.out.println("Foi reproduzida " + audio.getTotalReproductions() + " vezes");
        System.out.println("Possui uma classificação de " + audio.getClassification() + " estrelas");
        System.out.println(audio.getTotalLikes() + " pessoas gostaram da música.");



    }
}