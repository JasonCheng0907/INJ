package com.example.INJ.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;

import com.example.INJ.dao.NewsDao;
import com.example.INJ.model.News;

public class NewsImpl implements NewsDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void add(News news) throws Exception {
		String sql = "INSERT INTO church.news (id, category_id, title, content, reporter, city, report_time, "
				+ "news_source, headline, file_name, active, start_time, end_time, forever, creator, "
				+ "create_time, modifier, modify_time) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		String id = news.getId(), category_id = news.getCategory_id(), title = news.getTitle(),
				content = news.getContent(), reporter = news.getReporter(), city = news.getCity(),
				news_source = news.getNews_source(), headline = news.getHeadline(), file_name = news.getFile_name(),
				active = news.getActive(), forever = news.getForever(), creator = news.getCreator(),
				modifier = news.getModifier();
		Timestamp report_time = news.getReport_time(), start_time = news.getStart_time(), end_time = news.getEnd_time(),
				create_time = news.getCreate_time(), modify_time = news.getModify_time();

		jdbcTemplate.update(sql, id, category_id, title, content, reporter, city, report_time, news_source, headline,
				file_name, active, start_time, end_time, forever, creator, create_time, modifier, modify_time);
	}

	@Override
	public void delete(String id) throws Exception {
		String sql = "delete from church.news where id = ?";
		jdbcTemplate.update(sql, id);
	}

	@Override
	public void update(News news) throws Exception {
		String sql = "update church.news set category_id=?, title=?, content=?, reporter=?, city=?, report_time=?, "
				+ "news_source=?, headline=?, file_name=?, active=?, start_time=?, end_time=?, forever=?, modifier=?, "
				+ "modify_time=? where id=?";

		String id = news.getId(), category_id = news.getCategory_id(), title = news.getTitle(),
				content = news.getContent(), reporter = news.getReporter(), city = news.getCity(),
				news_source = news.getNews_source(), headline = news.getHeadline(), file_name = news.getFile_name(),
				active = news.getActive(), forever = news.getForever(), modifier = news.getModifier();
		Timestamp report_time = news.getReport_time(), start_time = news.getStart_time(), end_time = news.getEnd_time(),
				modify_time = news.getModify_time();

		jdbcTemplate.update(sql, category_id, title, content, reporter, city, report_time, news_source, headline,
				file_name, active, start_time, end_time, forever, modifier, modify_time, id);
	}

	@Override
	public List select(Model model) throws Exception {
		String sql = "SELECT * FROM church.news";
		List newsList = jdbcTemplate.queryForList(sql);
		return newsList;
	}

	@Override
	public List findById(String id) throws Exception {
		String sql = "SELECT * FROM church.news where id=?";
		List newsList = jdbcTemplate.queryForList(sql, id);
		return newsList;
	}

}
