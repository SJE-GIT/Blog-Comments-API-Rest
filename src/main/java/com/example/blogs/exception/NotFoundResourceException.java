package com.example.blogs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 
 * @author lenovo
 *
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundResourceException extends RuntimeException {
    
	private static final long serialVersionUID = 1L;
	private Object fieldValue;
	private String fieldName;
	private String resourceName;

    public NotFoundResourceException( String resourceName, String fieldName, Object fieldValue) {
        super(String.format("%s resource not found with %s : '%s'", resourceName, fieldName, fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }
}
