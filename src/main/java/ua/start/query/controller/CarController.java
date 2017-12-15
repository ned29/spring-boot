package ua.start.query.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.start.model.Car;
import ua.start.model.Description;
import ua.start.query.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carsService;

    private List<Description> descriptions = new ArrayList<>();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showLogin() {
        return "login";
    }

    @RequestMapping(value = "/addGoods", method = RequestMethod.GET)
    public String showAddGoodsPage(Model model) {
        model.addAttribute("cars", new Car());
        model.addAttribute("description", new Description());
        return "addGoods";
    }

    @RequestMapping(value = "/addGoods", method = RequestMethod.POST)
    public String addGoods(@ModelAttribute("cars") Car cars, @ModelAttribute("description") Description description) {
        descriptions.add(new Description(description.getPrice(), description.getColor(), description.getModel()));
        carsService.save(new Car(cars.getCar(), descriptions));
        return "redirect:/goodsList";
    }

    @RequestMapping(value = "/goodsList", method = RequestMethod.GET)
    public String showAll(Model model) {
        model.addAttribute("goods", carsService.findAll());
        return "goodsList";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(@RequestParam(value = "name", required = false) String name, Model model) {
        model.addAttribute("result", carsService.findByCar(name));
        return "search";
    }
}
