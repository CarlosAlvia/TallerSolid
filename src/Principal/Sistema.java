/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Adicionales.Aderezo;
import Adicionales.Crema;
import Adicionales.Frutilla;
import Postres.*;
import Procesos.*;
import Leche.*;
import java.util.ArrayList;
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Descremada
        // Finalmente mostrar el precio final de cada uno
        ArrayList<Postre> arrPostres = new ArrayList<>();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        
        // Producir Helado
        Postre helado_vainilla = new Helado("Vainilla");
        arrPostres.add(helado_vainilla);
        // Producir Pastel
        Postre pastel_chocolate = new Pastel("Chocolate");
        arrPostres.add(pastel_chocolate);
        
        arrPostres.forEach(postre -> {
            postre.addAderezos(new Crema());
            postre.addAderezos(new Frutilla());
            System.out.println(postre);
            mnj_leche.cambiarTipoLeche(new LecheDescremada(),postre);
            System.out.println(ManejadorDePrecio.showPrecioFinal(postre));
        });        

        
    }
}
