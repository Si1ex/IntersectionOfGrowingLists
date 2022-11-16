

import java.util.ArrayList;
import java.util.Iterator;
public class TRAI_22_X2_dankurhi implements TRAI_22_X2 {
    
    public ArrayList<Integer> kasvavienLeikkaus(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> tulos = new ArrayList<>();
        Iterator<Integer> iterator = A.listIterator();

        // TODO
        //Käydään A listaa läpi iteraattorilla
        while (iterator.hasNext()) {

            //Iteraattori saa listan arvon
            Integer arvo = iterator.next();

            //Jos B lista sisältää kyseisen arvon...
            if (B.contains(arvo)) {

                //Tarkistetaan löytyykö kyseinen arvo jo valmiiksi tuloslistasta (vältetään samoja arvoja). Jos löytyy, jatketaan eteenpäin.
                if (tulos.contains(arvo)) {
                    continue;

                //Muussa tapauksessa (kun arvo ei löydy tuloslistasta) lisätään kyseinen arvo tuloslistaan.
                } else {
                    tulos.add(arvo);
                }
            }
        }
        //Palautetaan tuloslista.
        return tulos;
    }
}

