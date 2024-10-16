package Models;

public class Favorites {
    public void includes (Audio audio) {
        if (audio.getClassification() >= 9) {
            System.out.println(audio.getTitle() + " não sai dos falantes da galera!!"  );
        } else {
            System.out.println(audio.getTitle() + " pessoal está avaliando como mediano, não esqueça de dar sua nota!");
        }
    }


}
