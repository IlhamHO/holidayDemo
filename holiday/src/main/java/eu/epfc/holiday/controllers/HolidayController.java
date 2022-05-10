package eu.epfc.holiday.controllers;

import eu.epfc.holiday.entities.Holiday;
import eu.epfc.holiday.repositories.HolidayRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HolidayController {
    private HolidayRepository repository;

    public HolidayController(HolidayRepository repository) {
        this.repository = repository;
    }
    @GetMapping ("holidays")
    public String get(Model model){
        List<Holiday> holidays = repository.findAll();
        for(Holiday h : holidays) System.out.println(h);
        model.addAttribute("list",holidays);
        return "holidays";
    }
}
