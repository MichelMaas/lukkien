/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.maas_fam.lukkien;

import nl.maas_fam.lukkien.data.ItWorks;
import org.springframework.stereotype.Service;

/**
 *
 * @author michel
 */
@Service
public class ItWorksService {

    public String itWorks() {
        return itWorksObject().getItWorks();
    }

    public ItWorks itWorksObject() {
        return new ItWorks();
    }
}
