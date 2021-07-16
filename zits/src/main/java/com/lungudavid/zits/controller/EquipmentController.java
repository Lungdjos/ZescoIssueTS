package com.lungudavid.zits.controller;

import com.lungudavid.zits.model.Equipment;
import com.lungudavid.zits.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EquipmentController {
    @Autowired
    private EquipmentService equipmentService;

    //method handler to display list of equipment
    @GetMapping("/equipment")
    public String showEquipment(Model model){
        model.addAttribute("listEquipment", equipmentService.getAllEquipment());
        return "available_equip"; //thymeleaf template
    }

    //method handler to show add new equipment page
    @GetMapping("/newEquipmentForm")
    public String newEquipmentForm(Model model){
        //creating model attribute to bind form data with Key-Value mapping
        Equipment equipment = new Equipment();  //Equipment object
        model.addAttribute("equipment", equipment);
        return "new_equipment";
    }

    //method handler for saving an equipment
    @PostMapping("/saveEquipment")
    public String saveEquipment(@ModelAttribute("equipment")Equipment equipment){
        //saving an equipment to database
        equipmentService.addEquipment(equipment);
        return "redirect:/equipment";
    }
}
