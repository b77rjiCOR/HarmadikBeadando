package com.example.B77RJI_HarmadikBeadando;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.PrintWriter;
import java.util.Optional;

@ResponseBody
@RestController
public class MainController {

    @PostMapping("/reverse")
    public String doPost(@RequestBody Optional<String> szoveg)
    {
        StringBuffer sbf = new StringBuffer(String.valueOf(szoveg.orElseGet(() -> "Alma a fa alatt!"))).reverse();
        return sbf.toString();
    }

    @GetMapping(path = "/harmadik")
    public String doGet(@RequestParam Optional<String> name)
    {
        return "Hello " + name.orElseGet(() -> "Felhasználó") + "!";
    }

}
