package ar.edu.unlam.tallerweb1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FeedbackController {

    @RequestMapping("/feedback")
    public ModelAndView mav (){
        return new ModelAndView("feedback", new ModelMap());
    }


}
