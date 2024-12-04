package de.claudioaltamura.spring_boot_custom_annotations;

import de.claudioaltamura.spring_boot_custom_annotations.annotation.RequestLogger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class CustomAnnotationController {

    @GetMapping
    @RequestLogger(key = "simple")
    public String test() {
        return "Hello World";
    }
}
