package com.example.INJ.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.INJ.dao.VideoDao;
import com.example.INJ.model.Video;

/**
 * @author jason
 * @version 建立時間:2021年8月12日 下午4:35:57
 */
@Service
public class VideoImpl implements VideoDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void add(Video video) throws Exception {

		String sql = "INSERT INTO video (id, name, member_id, category_id, description, video_time, active, approve, "
				+ "file_name, file_name2, youtube_code, start_time, end_time, forever, view_times, recommend, index_recommend, "
				+ "creator, create_time, modifier, modify_time) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		jdbcTemplate.update(sql, video.getId(), video.getName(), video.getMember_id(), video.getCategory_id(),
				video.getDescription(), video.getVideo_time(), video.getActive(), video.getApprove(),
				video.getFile_name(), video.getFile_name2(), video.getYoutube_code(), video.getStart_time(),
				video.getEnd_time(), video.getForever(), video.getView_times(), video.getRecommend(),
				video.getIndex_recommend(), video.getCreator(), video.getCreate_time(), video.getModifier(),
				video.getModify_time());
	}

	@Override
	public void delete(String id) throws Exception {
		String sql = "delete from video where id = ?";
		jdbcTemplate.update(sql, id);
	}

	@Override
	public void update(Video video) throws Exception {

		String sql = "update video set name=?, category_id=?, description=?, video_time=?, file_name=?, file_name2=?, "
				+ "start_time=?, end_time=?, recommend=?, index_recommend=?, active=?, approve=?, modifier=?, "
				+ "modify_time=? where id=?";

		jdbcTemplate.update(sql, video.getName(), video.getCategory_id(), video.getDescription(), video.getVideo_time(),
				video.getFile_name(), video.getFile_name2(), video.getStart_time(), video.getEnd_time(),
				video.getRecommend(), video.getIndex_recommend(), video.getActive(), video.getApprove(),
				video.getModifier(), video.getModify_time(), video.getId());
	}

	@Override
	public List select(Model model) throws Exception {
		String sql = "SELECT v.*, c.name AS category_name FROM video v INNER JOIN category c ON v.category_id = c.id";
		List videoList = jdbcTemplate.queryForList(sql);
		return videoList;
	}

	@Override
	public List findById(String id) throws Exception {
		String sql = "SELECT v.*, c.name AS category_name FROM video v INNER JOIN category c ON v.category_id = c.id "
				+ "where v.id = ?";
		List videoList = jdbcTemplate.queryForList(sql, id);
		return videoList;
	}

	@Override
	public List findByKeywords(String keywords, Video video) throws Exception {
		StringBuffer sql = new StringBuffer("SELECT v.*, c.name AS category_name FROM video v");
		sql.append(" INNER JOIN category c ON v.category_id = c.id");
		sql.append(" where v.name = ?");
		String kw = "%" + keywords + "%";

		if (!video.getActive().equals("2")) {
			sql.append(" and v.active=?");
		}

		if (!video.getCategory_id().equals("0")) {
			sql.append(" and v.category_id=?");
		}

		if (!video.getApprove().equals("3")) {
			sql.append(" and v.approve=?");
		}

		if (null != video.getStart_time()) {
			sql.append(" and v.start_time >= ? and v.start_time <= ?");
		}
		if (null != video.getEnd_time()) {
			sql.append(" and v.end_time >= ?");
		}
		String query = sql.toString();
		List newsList = jdbcTemplate.queryForList(query, kw);
		return newsList;
	}

}
