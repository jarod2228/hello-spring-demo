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

    //lives /hello/hello
    //Handler that handles requests of the form /hello?name=LaunchCode
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//    public String helloWithQueryAndLanguageParam(@RequestParam String language, String name) {
//        return "Hello, " + name + "!";
//    }

    //Handles requests of the form /hello/LaunchCode
//    @GetMapping("{name}")
//    public String helloWithPathParam(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }
    //lives at /hello/form
    @RequestMapping(method = RequestMethod.GET)
    public String helloForm() {
        return "<form method='post'>" +
                "<input type='text' name='name'>" +
                "<select name='language>" +
                "<option value='english' selected='true'>English</option>" +
                "<option value='french'>French</option>" +
                "<option value=''spanish'>Spanish</option>" +
                "<option value='chinese'>Chinese</option>" +
                "<option value='japanese'>Japanese</option>" +
                "</select>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String createMessage(@RequestParam String name, @RequestParam String language) {
        if (name == null) {
            name = "World";
        }
        String greeting = "";

        if (language.equals("english")) {
            greeting = "Hello";
        } else if (language.equals("french")) {
            greeting = "Bonjour";
        } else if (language.equals("spanish")) {
            greeting = "Hola";
        } else if (language.equals("chinese")) {
            greeting = "Ni hao";
        } else if (language.equals("japanese")) {
            greeting = "Kon'nichiwa";
        }
        return "<p style='color: red; text-align center; margin-top: 20vh; font-size: 20px'>"greeting + name;
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
