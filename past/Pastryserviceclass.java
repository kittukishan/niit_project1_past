package site.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.demo.dao.Pastrydaoclass;
import site.demo.dao.Pastrydaointer;
import site.demo.model.Pastries;
;

@Service
public class Pastryserviceclass implements Pastrydaointer {
@Autowired
public Pastrydaoclass dao;
	public List<Pastries> showitems() {
		System.out.print("\nServ - showitems");
		List<Pastries> items=dao.showitems();
		return items;
	}

}
