/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.maas_fam.lukkien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author michel
 */
@Controller
@RequestMapping(value = "/")
public class LukkienHTMLController {

    @Autowired
    private ItWorksService itWorksService;

    @RequestMapping(value = "/working")
    public ModelAndView loadHomePage(Model m) {
        m.addAttribute("text", itWorksService.itWorks());
        return new ModelAndView("home");
    }
}
