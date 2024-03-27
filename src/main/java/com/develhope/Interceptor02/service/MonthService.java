package com.develhope.Interceptor02.service;

import com.develhope.Interceptor02.entities.Month;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MonthService {
    private ArrayList<Month> months = new ArrayList<>();


    public Month findMonthByNumber(Integer monthNumber) {
        for (Month month : months) {
            if (month.getMonthNumber().equals(monthNumber)) {
                return month;
            }
        }
        return null;
    }
}



