package com.tutrit.mm.webboot.controller;

import com.tutrit.mm.bean.Person;
import com.tutrit.mm.dao.gateway.PersonRepositoryInterface;
import com.tutrit.mm.webboot.dto.PersonDto;
import com.tutrit.mm.webboot.dto.PersonMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MyController {
    private final PersonRepositoryInterface personRepository;

    public MyController(PersonRepositoryInterface personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/")
    public @ResponseBody String home() {
        return "home";
    }

    @GetMapping("/{name}/{age}")
    public ModelAndView makePerson(@PathVariable String name,
                                   @PathVariable String age) {
        personRepository.save(new Person(name, age, LocalDateTime.now()));
        List<PersonDto> people = personRepository.findAll()
                .stream()
                .map(PersonMapper::map)
                .collect(Collectors.toList());
        ModelAndView modelAndView = new ModelAndView("person");
        modelAndView.addObject("peopleList", people);
        return modelAndView;
    }
}
