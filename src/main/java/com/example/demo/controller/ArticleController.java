package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Article;
import com.example.demo.form.ArticleForm;
import com.example.demo.repository.ArticleRepository;

/**
 * 入力画面に全件検索情報をつけて返すコントローラ
 * 
 * @author kento.taira
 *
 */
@Controller
@Transactional
@RequestMapping("/article")
public class ArticleController {

	/*
	 * @Autowired private ServletContext application;
	 */

	@Autowired
	public ArticleRepository repository;

	// 空のFormをインスタンス化してrequestスコープにセットする
	@ModelAttribute
	public ArticleForm setUpForm() {

		return new ArticleForm();
	}

	/**
	 * 全件検索情報をのせて入力画面出力
	 * 
	 * @param model
	 *            モデル
	 * @return 出力画面
	 */
	@RequestMapping("/index1")
	public String index1(Model model) {
		List<Article> articleList = repository.findAll();
		System.out.println(articleList);
		model.addAttribute("articleList", articleList);

		return "index1";
	}

}
