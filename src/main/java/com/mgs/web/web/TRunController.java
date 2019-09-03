package com.mgs.web.web;

import com.mgs.web.model.TRun;
import com.mgs.web.service.TRunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TRunController {

    @Autowired
    TRunService tRunService;

    @GetMapping("/list")
    public String testRunList(Model model){
        List<TRun> testList= tRunService.getAll();
        model.addAttribute("testList", testList);
        return "list";
    }

    @GetMapping("/showTestInfo")
    public String testInfo(@RequestParam("testId") Integer testId,Model model){
        TRun testRunInfo = tRunService.getById(testId);
        model.addAttribute("testInfo", testRunInfo);
        return "testInfo";
    }
}
