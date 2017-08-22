package com.goal.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.goal.form.UserForm;
import com.goal.util.StringUtil;

/**
 * this class is used to validate the form bean
 * @author lizhiwei
 *
 */
public class UserValidator implements Validator{

	/**
	 * implemented method, to judge if given object is target obj
	 */
	public boolean supports(Class<?> clazz) {
		return UserForm.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors e) {
		UserForm uf = (UserForm)obj;
		if(StringUtil.isEmpty(uf.getName())) {
			e.rejectValue("name", null, null,"name can not be empty!");
		}
	}

}
