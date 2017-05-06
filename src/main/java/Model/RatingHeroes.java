/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import JSONModel.RegionHero;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Izymi
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class RatingHeroes implements Serializable {

    private long id;
    private RegionHero us;
    private RegionHero eu;

    public RatingHeroes() {
        this.id = 0L;
        this.eu = new RegionHero();
        this.us = new RegionHero();
    }

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @OneToOne(targetEntity = RegionHero.class,
            cascade = CascadeType.ALL)
    public RegionHero getUs() {
        return us;
    }

    public void setUs(RegionHero us) {
        this.us = us;
    }

    @OneToOne(targetEntity = RegionHero.class,
            cascade = CascadeType.ALL)
    public RegionHero getEu() {
        return eu;
    }

    public void setEu(RegionHero eu) {
        this.eu = eu;
    }

}
