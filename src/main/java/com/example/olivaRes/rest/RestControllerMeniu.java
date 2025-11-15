package com.example.olivaRes.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerMeniu {

    @GetMapping("/meniu")
    public String Meniu() {

        return "<h1 style=\"background-color:D1BD47;\"> Meniu:</h1>"  +
                "<br> 1. Supă de pui  <br/>"    +
                "<br> 2. Cartofi prăjiți <br/>" +
                "<br> 3.Șnițel de pui <br/>"    +
                "<br> 4. Salată simplă (roșii + castraveți) <br/>" +
                "<br> 5. Clătite cu dulceață <br/> ";

    }

    @GetMapping("/meniu-reducere")
    public String MeniuReduceri() {

        return "<h1 style=\"background-color:C2504C;\"> Meniu cu reduceri:</h1>"  +

                "<br> 1. Supă de pui — <b>20 lei</b> (Pret vechi: 40 lei) <b style=\"color:tomato;\" >50%</b> <br/>" +
                "<br> 2. Cartofi prăjiți — <b>10 lei</b> (Pret vechi: 20 lei) <b style=\"color:tomato;\" >50%</b> <br/>" +
                "<br> 3. Șnițel de pui — <b>25 lei</b> (Pret vechi: 50 lei) <b style=\"color:tomato;\" >50%</b> <br/>" +
                "<br> 4. Salată simplă (roșii + castraveți) — <b>12.5 lei</b> (Pret vechi: 25 lei) <b style=\"color:tomato;\" >50%</b> <br/>" +
                "<br> 5. Clătite cu dulceață — <b>15 lei</b> (Pret vechi: 30 lei) <b style=\"color:tomato;\" >50%</b> <br/>";

    }

}
