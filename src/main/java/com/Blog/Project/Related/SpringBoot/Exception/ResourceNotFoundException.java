package com.Blog.Project.Related.SpringBoot.Exception;

public class ResourceNotFoundException extends RuntimeException {
    String resourceName;
    String  fieldName;
     long fieldValue;
    public ResourceNotFoundException(String resourceName, String fieldName, long fieldValue) {
        super(String.format("%s Not Found with %s : %s", resourceName,fieldName,fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
}
