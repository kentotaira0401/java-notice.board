package com.example.demo.domain;

/**
 * articles情報を表すドメイン
 * 
 * @author kento.taira
 *
 */
public class Article {
	/** id */
	private Integer id;
	/** 投稿者名 */
	private String name;
	/** 投稿内容 */
	private String content;
	// private List<Comment> commentList;

	public Integer getId() {
		return id;
	}

	public Article() {
		super();
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", name=" + name + ", content=" + content + "]";
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Article(Integer id, String name, String content) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
