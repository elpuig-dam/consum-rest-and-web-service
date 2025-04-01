package com.example.consumingrest;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteService {
    //@Autowired
    RestTemplate restTemplate = new RestTemplate();

    public String getQuote() {
        Quote quote = restTemplate.getForObject("https://api.chucknorris.io/jokes/random",Quote.class);
        return quote.getValue();
    }

}
