package com.example.INJ.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.INJ.dao.NewsDao;
import com.example.INJ.model.News;

@Service
public class NewsImpl implements NewsDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void add(News news) throws Exception {
		String sql = "INSERT INTO news (id, category_id, title, content, reporter, city, report_time, "
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
		String sql = "delete from news where id = ?";
		jdbcTemplate.update(sql, id);
	}

	@Override
	public void update(News news) throws Exception {
		String sql = "update news set category_id=?, title=?, content=?, reporter=?, city=?, report_time=?, "
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
		String sql = "SELECT n.*, ns.name AS news_source_name, c.name AS category_name FROM news n INNER JOIN "
				+ "category c ON n.category_id = c.id INNER JOIN news_source ns ON n.news_source = ns.id";
		List newsList = jdbcTemplate.queryForList(sql);
		return newsList;
	}

	@Override
	public List findById(String id) throws Exception {
		String sql = "SELECT * FROM news where id = ?";
		List newsList = jdbcTemplate.queryForList(sql, id);
		return newsList;
	}

	@Override
	public List findByKeywords(String keywords, String active, String news_source, String category_id,
			Timestamp start_time, Timestamp end_time) throws Exception {
		String sql = "SELECT n.*, ns.name AS news_source_name, c.name AS category_name FROM news n "
				+ "INNER JOIN news_source ns ON n.news_source = ns.id INNER JOIN category c ON n.category_id = c.id "
				+ "where (n.title LIKE ?) AND (n.active=?) AND (n.news_source=?) AND (n.category_id=?) "
				+ "AND (n.start_time>=?) AND (n.end_time<=?)";
		String kw = "%" + keywords + "%";
		List newsList = jdbcTemplate.queryForList(sql, kw, active, news_source, category_id, start_time, end_time);
		return newsList;
	}

	@Override
	public List findByKeywords(String keywords, String news_source, String category_id, Timestamp start_time,
			Timestamp end_time) throws Exception {
		String sql = "SELECT n.*, ns.name AS news_source_name, c.name AS category_name FROM news n "
				+ "INNER JOIN news_source ns ON n.news_source = ns.id INNER JOIN category c ON n.category_id = c.id "
				+ "where (n.title LIKE ?) AND (n.news_source=?) AND (n.category_id=?) "
				+ "AND (n.start_time>=?) AND (n.end_time<=?)";
		String kw = "%" + keywords + "%";
		List newsList = jdbcTemplate.queryForList(sql, kw, news_source, category_id, start_time, end_time);
		return newsList;
	}
}
