/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hadsereg;

/**
 *
 * @author szikra
 */
public class Nyilas extends Katona{
    private int lotav;

    public Nyilas() {
        this.lotav = lotav;
    }
    
    public Nyilas(int lotav, double tamadoEro, double vedoEro) {
        super(tamadoEro, vedoEro);
        this.lotav = lotav;
    }
    
    

    public int getLotav() {
        return (int) (lotav + getTamadoEro());
    }

    public void setLotav(int lotav) {
        this.lotav = lotav;
    }   
}
