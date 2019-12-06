package miage.cbg.bowling;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartieTest {
@Test
    public void testCalculeScoreSansStrikeSansSpare {
        // given: une partie avec 10 jeux identiques  faisant tomber 5 quilles sur les 2 lancées ( le quoi on specifie a laide du programme un autre programme)
    Jeu leJeu = new Jeu(5,0);
    Partie laPartie = new Partie(leJeu);

        // when: quand on calcule le score
        int score = laPartie.calculeScore();

        //then : on obtient un score de 50
        assertEquals(50, score);
    }
@Test
    public void getTestCalculeScoreSpareUniquement{
        //given: une partie avec 10 jeux identiques correspondant uniquement à des spares
        Jeu leJeu = new Jeu(5,5);
        Partie laPartie = new Partie(leJeu);

        // when: quand on calcule le score
        int score = laPartie.calculeScore();

        //then : on obtient un score de 150
        assertEquals(150, score);
    }
    @Test
    public void getTestCalculeScoreSpareStrkeUniquement{
        //given: une partie avec 10 jeux identiques correspondant uniquement à des strikes
        Jeu leJeu = new Jeu(10);
        Partie laPartie = new Partie(leJeu);

        // when: quand on calcule le score
        int score = laPartie.calculeScore();

        //then : on obtient un score de 150
        assertEquals(300, score);
    }
}