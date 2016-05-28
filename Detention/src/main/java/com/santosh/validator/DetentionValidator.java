package com.santosh.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.santosh.bean.Detention;

@Component
public class DetentionValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return Detention.class.equals(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		Detention detention = (Detention) arg0;

		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "name", "NotEmpty.detentionForm.name");

		if (detention.getList() == null || detention.getList().size() == 0) {
			arg1.rejectValue("list", "NotEmpty.detentionForm.list");
		}

		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "type", "NotEmpty.detentionForm.type");

		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "time", "NotEmpty.detentionForm.time");
	}

}
