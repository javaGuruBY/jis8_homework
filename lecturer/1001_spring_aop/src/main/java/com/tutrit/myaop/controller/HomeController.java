package com.tutrit.myaop.controller;

import com.tutrit.myaop.aspect.LogThis;
import com.tutrit.myaop.bean.Person;
import com.tutrit.myaop.interfaces.MyServiceI;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class HomeController {
    MyServiceI myService;

    @GetMapping("/")
    public String openHome() {
        return String.format("hello %s", myService.getMessage());
    }

    @GetMapping("/persons/{id}")
    public Person getPerson(HttpServletRequest request) {
        int age = Integer.parseInt(request.getParameter("age"));
        String name = request.getParameter("name");
        String uriTemplate = "/persons/{id}";//should be get with reflection from annotation.
        int from = uriTemplate.indexOf("{");
        int to = uriTemplate.indexOf("}")-1;
        long id = Long.valueOf(request.getRequestURI().substring(from, to));

        return myService.getPerson(age, name, id);
    }

    @PostMapping("/persons-asParams")
    public Person getPersonAsParams(HttpServletRequest request) {
        int age = Integer.parseInt(request.getParameter("age"));
        String name = request.getParameter("name");

        return myService.getPersonAsParams(age, name);
    }

    @LogThis
    @PostMapping("/persons-asObject")
    public Person getPersonAsObject(@RequestBody Person person) {
        return myService.getPersonAsObject(person);
    }

    //Spring params mapping
    @GetMapping("/web/persons/{id}")
    public Person getPersonWeb(@RequestParam String name,
                               @RequestParam Integer age,
                               @PathVariable Long id) {

        return myService.getPersonWeb(name, age, id);
    }

    //Spring params mapping
    @PostMapping("/web/persons-asParams")
    public Person getPersonAsParamsWeb(@RequestParam String name,
                                       @RequestParam Integer age) {

        return myService.getPersonAsParamsWeb(name, age);
    }

}
