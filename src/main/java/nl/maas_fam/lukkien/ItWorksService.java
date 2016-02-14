/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.maas_fam.lukkien;

import nl.maas_fam.lukkien.data.ItWorks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author michel
 */
@Service
public class ItWorksService {

    @Autowired
    private ItWorksDaoImpl itWorksDaoImpl;

    public String itWorks() {
        return itWorksObject().getText();
    }

    public ItWorks itWorksObject() {
        return itWorksDaoImpl.getAll().get(0);
    }
}
