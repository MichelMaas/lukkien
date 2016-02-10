/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.maas_fam.lukkien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author michel
 */
@RestController
public class LukkienRestController {
    @Autowired
    private ItWorksService itWorksService;
    
    @RequestMapping(value = "/rest/working",method = RequestMethod.GET,produces = "text/plain")
    public String restWorking(){
        return itWorksService.itWorks();
    }
}
