package com.santosh.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

@Component
public class DetentionUtil {

	public void populateDefaultModel(Model model) {
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("HOMEWORK", "STEALING", "FIGHTING", "UNTYDINESS", "LYING", "DAMAGE"));
		model.addAttribute("detentionList", list);
	}

}
