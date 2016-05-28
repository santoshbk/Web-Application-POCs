package com.santosh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.santosh.bean.Detention;
import com.santosh.bean.Offense;
import com.santosh.util.DetentionUtil;

@Component
public class DetentionService {

	@Autowired
	DetentionUtil util;

	public String showDetentionForm(Model model) {
		Detention detention = new Detention();
		model.addAttribute("detentionForm", detention);
		util.populateDefaultModel(model);
		return "form";
	}

	public String calculateDetention(Detention detention, Model model) {

		double detentionTime = calculateTime(detention.getType(), detention.getList());
		String time = detention.getTime();
		detentionTime = calculateDiscount(detentionTime, time);
		model.addAttribute("detetnionTime", detentionTime);
		model.addAttribute("student", detention.getName());
		if(Double.compare(detentionTime, 8)<0){
			return "success";
		} else {
			return "timeup";
		}
		
	}

	private double calculateDiscount(double detentionTime, String type) {
		switch (type) {
		case "good":
			return detentionTime - (detentionTime * 10 / 100);

		case "bad":
			return detentionTime + (detentionTime * 10 / 100);
		default:
			return 0;

		}

	}

	private double calculateTime(String type, List<String> list) {
		double totalTime = 0;
		switch (type) {
		case "concurrent":
			totalTime = calculateForConcurrent(list);
			break;
		case "consecutive":
			totalTime = calculateForConsecutive(list);
			break;
		}
		return totalTime;
	}

	private double calculateForConsecutive(List<String> list) {
		double totalTime = 0;
		for (String string : list) {
			Offense o = Offense.valueOf(string);
			totalTime += o.getVal();
		}
		return totalTime;
	}

	private double calculateForConcurrent(List<String> list) {
		double totalTime = 0;
		for (String string : list) {
			Offense o = Offense.valueOf(string);
			if (totalTime < o.getVal()) {
				totalTime = o.getVal();
			}
		}
		return totalTime;
	}
}
