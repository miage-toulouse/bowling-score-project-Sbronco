package miage.cbg.bowling;

import java.util.ArrayList;
import java.util.List;

public class Partie {

    private List<Jeu> jeux= new ArrayList<>();

    public Partie(Jeu leJeu) {
        for(int i=0;i<10;i++){
            jeux.add(leJeu);
        }
        if (jeux.get(9).isSpare()){
            jeux.add(leJeu);
        }
            }

    public int calculeScore(){
        int score = 0;
        for (int i=0;i<10;i++){
            score += jeux.get(i).nombreQuilleTombees();
            if (jeuCourant.isSpare()){
                score += jeux.get(i+1).nombreQuilleTombeesLancer1();
            }
        }
        return score;
    }
}