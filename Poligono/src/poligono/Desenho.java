/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligono;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guilherme.rmendes
 */
public class Desenho {

    String Nome;
    private List<IPoligono> Poligonos = new ArrayList<>();

    public Desenho(String Nome) {
        this.Nome = Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    public List<IPoligono> getPoligonos() {
        return Poligonos;
    }

    public String getNome() {
        return Nome;
    }

    public void MostrarPoligonos() {
System.out.println("Desenho: " + this.getNome());
        System.out.println("Poligonos: ");
        System.out.println("");
        for (IPoligono poligono : Poligonos) {
            poligono.GetData();
            poligono.GetArea();
            poligono.GetPerimetro();
            System.out.println("");
        }
    }
}
