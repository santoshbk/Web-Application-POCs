package com.santosh.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.santosh.bean.Detention;
import com.santosh.service.DetentionService;
import com.santosh.util.DetentionUtil;
import com.santosh.validator.DetentionValidator;

@Controller
@RequestMapping(value = "/")
public class DetentionController {

	@Autowired
	DetentionValidator detentionValidator;

	@Autowired
	DetentionUtil util;

	@Autowired
	DetentionService service;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setValidator(detentionValidator);
	}

	@RequestMapping(method = RequestMethod.GET)
	public String showDetentionForm(Model model) {
		return service.showDetentionForm(model);
	}

	@RequestMapping(method = RequestMethod.POST)
	public String calculate(@ModelAttribute("detentionForm") @Validated Detention detention, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			util.populateDefaultModel(model);
			return "form";
		} else {
			return service.calculateDetention(detention, model);
		}
	}

}
