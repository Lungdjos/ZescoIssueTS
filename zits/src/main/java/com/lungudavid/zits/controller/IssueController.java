package com.lungudavid.zits.controller;


import com.lungudavid.zits.model.Equipment;
import com.lungudavid.zits.model.Issue;
import com.lungudavid.zits.service.EquipmentService;
import com.lungudavid.zits.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IssueController {
    @Autowired
    private IssueService issueService;
    @Autowired
    private EquipmentService equipmentService;

    //displaying the available issues.
    @GetMapping(value = "/issue")
    public String showAvailableIssuesPg(Model model){
        model.addAttribute("listIssues", issueService.getAllIssues());
        return "issues_available";//to be done
    }

    //method handler to show add new equipment page
    @GetMapping("/newIssueForm")
    public String newIssuesForm(Model model){
        //creating model attribute to bind form data with Key-Value mapping
        Issue issue = new Issue();  //Issue object
        model.addAttribute("issue", issue);
        model.addAttribute("listEquipment", equipmentService.getAllEquipment());
        return "new_issue";
    }

    //method handler for saving an equipment
    @PostMapping("/saveIssue")
    public String saveEquipment(@ModelAttribute("issue") Issue issue){
        //saving an equipment to database
        issueService.addIssues(issue);
        return "redirect:/issue";
    }
}
