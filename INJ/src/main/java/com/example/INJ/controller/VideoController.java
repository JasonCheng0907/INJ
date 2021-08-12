package com.example.INJ.controller;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.INJ.service.VideoImpl;

/**
 * @author jason
 * @version 建立時間:2021年8月12日 下午4:36:01
 */
@Controller
@RequestMapping("/admin/video")
public class VideoController {

	@Autowired
	VideoImpl videoImpl;

	public static String shortUUID() {
		UUID uuid = UUID.randomUUID();
		long l = ByteBuffer.wrap(uuid.toString().getBytes()).getLong();
		return Long.toString(l, Character.MAX_RADIX);
	}

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("list")
	public String getVideoList(Model model) throws Exception {
		List videoList = videoImpl.select(model);
		model.addAttribute("video", videoList);
		return "/admin/video/list";
	}

	@GetMapping("edit{videoID}")
	public String getVideoEdit(@RequestParam(name = "videoID") String id, Model model) throws Exception {
		List videoList = videoImpl.findById(id);
		model.addAttribute("video", videoList);
		return "/admin/video/edit";
	}

	/*
	 * @PostMapping(value = "edit")
	 * 
	 * @ResponseBody public String edit(@RequestParam("id") String
	 * id, @RequestParam("name") String name,
	 * 
	 * @RequestParam("link") String link, @RequestParam("file") MultipartFile file,
	 * 
	 * @RequestParam("start_time") Date start_time, @RequestParam("end_time") Date
	 * end_time,
	 * 
	 * @RequestParam("active") String active, HttpServletRequest request) throws
	 * Exception { video video = new video(); String url =
	 * "C:\\Users\\Jason\\eclipse-workspace\\INJ\\src\\main\\resources\\static\\images\\";
	 * String file_name = id +
	 * file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(
	 * ".")); Timestamp st = new Timestamp(start_time.getTime()); Timestamp et = new
	 * Timestamp(end_time.getTime()); String modifier = "mdbc"; Timestamp
	 * modify_time = new Timestamp(System.currentTimeMillis()); video.setId(id);
	 * video.setName(name); video.setLink(link); video.setFile_name(file_name);
	 * video.setStart_time(st); video.setEnd_time(et); video.setActive(active);
	 * video.setModifier(modifier); video.setModify_time(modify_time); try {
	 * file.transferTo(new File(url + file_name)); } catch (IllegalStateException e)
	 * { e.printStackTrace(); } catch (IOException e) { e.printStackTrace(); }
	 * videoImpl.update(video); return "編輯成功"; }
	 */
	@RequestMapping("save")
	public String getVideoSave() {
		return "/admin/video/save";
	}
	/*
	 * @PostMapping(value = "save")
	 * 
	 * @ResponseBody public String save(@RequestParam("name") String
	 * name, @RequestParam("link") String link,
	 * 
	 * @RequestParam("file") MultipartFile file, @RequestParam("start_time") Date
	 * start_time,
	 * 
	 * @RequestParam("end_time") Date end_time, @RequestParam("active") String
	 * active, HttpServletRequest request) throws Exception {
	 * 
	 * video video = new video(); String id = shortUUID(); String file_name = id +
	 * file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(
	 * ".")); String recommend = "0"; String creator = "mdbc"; Timestamp create_time
	 * = new Timestamp(System.currentTimeMillis()); Timestamp st = new
	 * Timestamp(start_time.getTime()); Timestamp et = new
	 * Timestamp(end_time.getTime()); video.setId(id); video.setName(name);
	 * video.setFile_name(file_name); video.setLink(link); video.setActive(active);
	 * video.setApprove("2"); video.setTarget("0"); video.setStart_time(st);
	 * video.setEnd_time(et); video.setRecommend(recommend);
	 * video.setCreator(creator); video.setCreate_time(create_time);
	 * video.setModifier(creator); video.setModify_time(create_time); try {
	 * file.transferTo(new File(
	 * "C:\\Users\\Jason\\eclipse-workspace\\INJ\\src\\main\\resources\\static\\images\\"
	 * + file_name)); } catch (IllegalStateException e) { e.printStackTrace(); }
	 * catch (IOException e) { e.printStackTrace(); } videoImpl.add(video); return
	 * "新增成功"; }
	 */

	@GetMapping(value = "deleteVideo")
	@ResponseBody
	public String delete(@RequestParam(name = "videoID") String id) throws Exception {
		videoImpl.delete(id);
		return "刪除成功";
	}

	/*
	 * @PostMapping(value = "search") public String search(@RequestParam(name =
	 * "keywords") String keywords, @RequestParam(name = "active") String active,
	 * 
	 * @RequestParam(name = "Video_source") String Video_source,
	 * 
	 * @RequestParam(name = "category_id") String
	 * category_id, @RequestParam("start_time") Date start_time,
	 * 
	 * @RequestParam("end_time") Date end_time, Model model) throws Exception {
	 * Timestamp st = new Timestamp(start_time.getTime()); Timestamp et = new
	 * Timestamp(end_time.getTime()); DateFormat df = new
	 * SimpleDateFormat("yyyy/MM/dd"); String sst = df.format(start_time); String
	 * set = df.format(end_time); if (active.equals("2")) { List n1 =
	 * VideoImpl.findByKeywords(keywords, Video_source, category_id, st, et);
	 * model.addAttribute("Video", n1); } else { List n2 =
	 * VideoImpl.findByKeywords(keywords, active, Video_source, category_id, st,
	 * et); model.addAttribute("Video", n2); } model.addAttribute("keywords",
	 * keywords); model.addAttribute("start_time", sst);
	 * model.addAttribute("end_time", set); return "/admin/Video/list"; }
	 */
}
