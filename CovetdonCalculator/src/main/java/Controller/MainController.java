package Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    @GetMapping(value = {"/main", "/"}) // 메인페이지
    public String calculator(){
        System.out.println("들어옴");
        return "main";
    }
}
