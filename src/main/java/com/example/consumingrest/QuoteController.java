package com.example.consumingrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(QuoteController.QUOTE)
public class QuoteController {
    public static final String QUOTE = "/quote";

    @Autowired
    QuoteService quoteService;


    @GetMapping
    private String quote(Model model) {
        String q = quoteService.getQuote();
        model.addAttribute("quote",q);
        return "quote";
    }


}
