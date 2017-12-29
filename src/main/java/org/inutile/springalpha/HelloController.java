package org.inutile.springalpha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloController
{
    @RequestMapping("/")
    @ResponseBody
    String home()
    {
        return "Hello World!";
    }
    
//    private void shouldBeRemoved(int unused_arg) 
//    {
//    	System.out.println("This is not needed");
//    }
//
//    private void pleaseCreateAnIssue() {
//      System.out.println("WHat do I Have to do");
//    }

    public static void main(String[] args) throws Exception 
    {
        SpringApplication.run(HelloController.class, args);
    }
}
