package com.slsd.www.project.controller;

import java.util.List;
import java.util.Scanner;

import com.slsd.www.project.entity.Notice;
import com.slsd.www.project.service.NoticeService;
import com.slsd.www.project.service.impl.NoticeSerrviceImpl;

public class NoticeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoticeService noticeService = new NoticeSerrviceImpl();
		Scanner scanner = new Scanner(System.in);
		boolean isquit = false;
		System.out.println("请输入：1.新增|2.更新|3.删除|4.查询|5.查出2019的全部公告|6.根据title查绚|7.计数|0.退出");
		while (!isquit) {
			int ui = scanner.nextInt();
			switch (ui) {
			case 1:
				System.out.println("请输入：title，keyword，content，pubdate，author");
				String string = scanner.next();
				String[] params = string.split(",");
				Notice notice = new Notice();
				notice.setnId(0);
				notice.setnTitle(params[0]);
				notice.setnKeyword(params[1]);
				notice.setnContent(params[2]);
				notice.setnPubdate(params[3]);
				notice.setnAuthor(params[4]);
				boolean iosk = noticeService.save(notice);
				if (iosk) {
					System.out.println("添加成功！");
				} else {
					System.out.println("添加失败！");
				}
				break;
			case 2:
				System.out.println("请输入：title，keyword，content，pubdate，author，id");
				String string1 = scanner.next();
				String[] params1 = string1.split(",");
				Notice notice1 = new Notice();
				notice1.setnId(Integer.valueOf(params1[5]));
				notice1.setnTitle(params1[0]);
				notice1.setnKeyword(params1[1]);
				notice1.setnContent(params1[2]);
				notice1.setnPubdate(params1[3]);
				notice1.setnAuthor(params1[4]);
				boolean iosk1 = noticeService.update(notice1);
				if (iosk1) {
					System.out.println("修改成功！");
				} else {
					System.out.println("修改失败！");
				}
				break;
			case 3:
				int id = scanner.nextInt();
				boolean iosk2 = noticeService.delete(id);
				if (iosk2) {
					System.out.println("删除成功！");
				} else {
					System.out.println("删除失败！");
				}
				break;
			case 4:
				List<Notice> list = noticeService.findAll();
				list.forEach(System.out::println);
				break;
			case 5:
				List<Notice> list1 = noticeService.findBynPubdate();
				list1.forEach(System.out::println);
				break;
			case 6:
				String nTitle = scanner.next();
				List<Notice> list2 = noticeService.findBynTitle(nTitle);
				list2.forEach(System.out::println);
				break;
			case 7:
				int count = noticeService.count();
				System.out.println(count);
				break;
				default:
					isquit=true;
					break;
			}
		}
	}

}
