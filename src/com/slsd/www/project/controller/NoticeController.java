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
		System.out.println("�����룺1.����|2.����|3.ɾ��|4.��ѯ|5.���2019��ȫ������|6.����title��Ѥ|7.����|0.�˳�");
		while (!isquit) {
			int ui = scanner.nextInt();
			switch (ui) {
			case 1:
				System.out.println("�����룺title��keyword��content��pubdate��author");
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
					System.out.println("��ӳɹ���");
				} else {
					System.out.println("���ʧ�ܣ�");
				}
				break;
			case 2:
				System.out.println("�����룺title��keyword��content��pubdate��author��id");
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
					System.out.println("�޸ĳɹ���");
				} else {
					System.out.println("�޸�ʧ�ܣ�");
				}
				break;
			case 3:
				int id = scanner.nextInt();
				boolean iosk2 = noticeService.delete(id);
				if (iosk2) {
					System.out.println("ɾ���ɹ���");
				} else {
					System.out.println("ɾ��ʧ�ܣ�");
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
