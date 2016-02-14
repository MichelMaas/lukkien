/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.maas_fam.lukkien;

import java.util.List;
import nl.maas_fam.lukkien.data.ItWorks;

/**
 *
 * @author michel
 */
public interface ItWorksDao {

    List<ItWorks> getAll();

    ItWorks findById(long id);
}
