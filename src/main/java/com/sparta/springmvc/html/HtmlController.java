package com.sparta.springmvc.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    private static long visitCount = 0;


    @GetMapping("/static-hello")
    public String hello() {
        // 반환 값에 맞는 페이지를 찾아서 보여준다
        return "hello.html";
    }

    @GetMapping("/html/redirect")
    public String htmlStatic() {
        return "redirect:/hello.html";
    }

    @GetMapping("/html/templates")
    public String htmlTemplates() {
        return "hello";
    }

    @GetMapping("/html/dynamic")
    public String htmlDynamic(Model model) {
        visitCount++;
        // "visits" = 식별 가능한 이름
        model.addAttribute("visits", visitCount);

        return "hello-visit";
    }
}
