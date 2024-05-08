package com.example.board.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/articles")
@Slf4j
@Controller
public class ArticleController {
    @GetMapping
    public String articles(ModelMap map) {
        log.info("^^^^^^^^^");
        map.addAttribute("articles", List.of());
        return "articles/index";
    }

    @GetMapping("/{articleId}")
    public String article(@PathVariable("articleId") Long articleId, ModelMap map) {
        log.info("^^^^^^^" + articleId);
        map.addAttribute("article", "article"); // TODO: 구현할 때 여기에 실제 데이터를 넣어줘야 한다
        map.addAttribute("articleComments", List.of());

        return "articles/detail";
    }
}