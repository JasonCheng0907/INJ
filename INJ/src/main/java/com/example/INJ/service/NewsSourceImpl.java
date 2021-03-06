package com.example.INJ.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.INJ.dao.NewsSourceDao;
import com.example.INJ.model.NewsSource;

/**
 * @author jason
 * @version 建立時間:2021年8月12日 下午4:44:33
 */
@Service
public class NewsSourceImpl implements NewsSourceDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void add(NewsSource newsSource) throws Exception {
		String sql = "INSERT INTO news_source (id, name, file_name, active, creator, create_time, modifier, modify_time)"
				+ " VALUES (?,?,?,?,?,?,?,?)";

		String id = newsSource.getId(), name = newsSource.getName(), file_name = newsSource.getFile_name(),
				active = newsSource.getActive(), creator = newsSource.getCreator(), modifier = newsSource.getModifier();
		Timestamp create_time = newsSource.getCreate_time(), modify_time = newsSource.getModify_time();

		jdbcTemplate.update(sql, id, name, file_name, active, creator, create_time, modifier, modify_time);
	}

	@Override
	public void delete(String id) throws Exception {
		String sql = "delete from news_source where id = ?";
		jdbcTemplate.update(sql, id);
	}

	@Override
	public void update(NewsSource newsSource) throws Exception {
		String sql = "update news_source set name=?, file_name=?, active=?, modifier=?, modify_time=? where id=?";
		String id = newsSource.getId(), name = newsSource.getName(), file_name = newsSource.getFile_name(),
				active = newsSource.getActive(), modifier = newsSource.getModifier();
		Timestamp modify_time = newsSource.getModify_time();

		jdbcTemplate.update(sql, name, file_name, active, modifier, modify_time, id);
	}

	@Override
	public List select(Model model) throws Exception {
		String sql = "SELECT * FROM news_source";
		List newsSourceList = jdbcTemplate.queryForList(sql);
		return newsSourceList;
	}

	@Override
	public List findById(String id) {
		String sql = "SELECT * FROM news_source where id=?";
		List newsSourceList = jdbcTemplate.queryForList(sql, id);
		return newsSourceList;
	}

	@Override
	public List findByKeywords(String keywords, String active) throws Exception {
		String sql = "SELECT * FROM news_source where (name LIKE ?) AND (active=?)";
		String kw = "%" + keywords + "%";
		List newsSourceList = jdbcTemplate.queryForList(sql, kw, active);
		return newsSourceList;
	}

	@Override
	public List findByKeywords(String keywords) throws Exception {
		String sql = "SELECT * FROM news_source where name LIKE ?";
		String kw = "%" + keywords + "%";
		List newsSourceList = jdbcTemplate.queryForList(sql, kw);
		return newsSourceList;
	}

}
