package com.codewithagadjan.rest_api_todo.easypath;

import java.time.LocalDate;

public record Test(Long id, String name, String descirption, String city, String organizer, LocalDate createdDate){
}
