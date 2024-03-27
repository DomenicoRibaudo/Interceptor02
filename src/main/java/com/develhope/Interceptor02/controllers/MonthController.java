package com.develhope.Interceptor02.controllers;

import com.develhope.Interceptor02.entities.Month;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/months")
public class MonthController {
    @GetMapping("/findmonth/{monthNumber}")
    public Month getMonth(HttpServletRequest request, @PathVariable Integer monthNumber) {
        return (Month) request.getAttribute("selectedMonth");
    }
}

