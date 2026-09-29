package com.codewithagadjan.rest_api_todo.easypath;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/groups")
public class TestController {


    private List<Test> list = new ArrayList<>();
    private final AtomicLong id = new AtomicLong(1);

    public TestController(){

        list.add(new Test(
                id.getAndIncrement(),
                "CleveLand Java User Group",
                "A community of java developers in the CleveLand area sharing knowledge and best practice",
                "Sparta",
                "Dan Vega",
                LocalDate.of(2010,3,15)
        ));

        list.add(new Test(
                id.getAndIncrement(),
                "CleveLand React MeetUp",
                "Monthly meetup for React and JavaScript developers",
                "Cleveland",
                "Sarath JohnSon",
                LocalDate.of(2017,6,1)
        ));

    }

    @GetMapping("/")
    List<Test> getAllGroups(){
        return list;
    }

    @GetMapping("/{id}")
    Optional<Test> getGroup(@PathVariable Long id){
        return list.stream()
                .filter(g->g.id().equals(id)).findFirst();
    }





}
