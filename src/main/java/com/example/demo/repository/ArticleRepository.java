package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Article;

/**
 * articlesテーブルとcommentsテーブルの操作用リポジトリ
 * 
 * @author kento.taira
 *
 */
@Repository
public class ArticleRepository {

	private final static String TABLE_NAME1 = "articles";
	private final static String TABLE_NAME2 = "comments";
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	private final static RowMapper<Article> ARTICLE_ROW_MAPPER = (rs, i) ->{
		
		Article article = new Article();
		article.setId(rs.getInt("id"));
		article.setName(rs.getString("name"));
		article.setContent(rs.getString("content"));
		
		return article;
	};
	
	/**
	 * 記事の全件検索
	 * 
	 * @return 記事の全件情報
	 */
	public List<Article> findAll(){
		
		String sql = "select id, name, content from " + TABLE_NAME1;
		List<Article> articleList = template.query(sql, ARTICLE_ROW_MAPPER);
		
		
		return articleList;
	}
	
}
