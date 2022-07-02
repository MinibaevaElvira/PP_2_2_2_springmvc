package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.DaoCar;


@Controller
@RequestMapping("/cars")
public class CarsController {
    private final DaoCar daoCar;

    public CarsController(DaoCar daoCar) {
        this.daoCar = daoCar;
    }


    @GetMapping()
    public String show (@RequestParam(defaultValue = "5") int count, Model model) {
        model.addAttribute("countCar", daoCar.showOfCar(count));
        return "/cars";
    }


}
