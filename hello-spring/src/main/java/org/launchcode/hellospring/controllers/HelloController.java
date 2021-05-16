package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    //Handles request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    //lives at /hello/goodbye
    @GetMapping("goodbye")
    public String goodbye() {
        return "goodbye, Spring!";
    }
    //lives /hello/hello
    //Handler that handles requests of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryAndLanguageParam(@RequestParam String language, String name) {
        return "Hello, " + name + "!";
    }

    //Handles requests of the form /hello/LaunchCode
    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";

    }
    //lives at /hello/form
    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action='/hello' method='get'>" +  //submit a request to /hello
                "<input type='text' name='name'>" +
                "<select name='languages id='languageOption'>" +
                "<option value='english' selected='true'>English</option>" +
                "<option value='french'>French</option>" +
                "<option value=''spanish'>Spanish</option>" +
                "<option value='chinese'>Chinese</option>" +
                "<option value='japanese'>Japanese</option>" +
                "</select>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//    public String createMessage(@RequestParam String name, String language) {
//        if (/*english selected*/) {
//            return "Hello, " + name + "!";
//        } else if (/*french selected*/) {
//            return "Bonjour, " + name + "!";
//        } else if (/*spanish selected*/) {
//            return "Hola, " + name + "!";
//        } else if (/*chinese selected*/) {
//            return "Ni hao, " + name + "!";
//        } else if (/*japanese selected*/) {
//            return "Kon'nichiwa, " + name + "!";
//        }
//
//    }

}
