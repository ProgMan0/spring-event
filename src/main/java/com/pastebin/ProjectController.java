package com.pastebin;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ProjectController {
    private final TestRepo testRepo;

    @GetMapping("/api")
    public String get() {
        Testing testing = new Testing();

        testing.setHello("hihihihihi");

        return testRepo.save(testing).getHello();
    }
}
