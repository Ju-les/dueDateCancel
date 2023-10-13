package com.envite.example;

import lombok.RequiredArgsConstructor;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@Component
@RequiredArgsConstructor
public class dueDateService {

    public Date customTaskDueDate(DelegateExecution execution) {
        return Date.from(LocalDateTime.now().plusDays(2).atZone(ZoneId.systemDefault()).toInstant());
    }
}
