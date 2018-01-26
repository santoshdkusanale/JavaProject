/**
 * 
 */
package com.annotation.examples;

import java.lang.annotation.Documented;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;;
@Documented
@Target(value = { null })
public @interface ClassPreamble {
	String author();
	String date();
	int currentRevision() default 1;
	String lastModified() default "N/A";
	String lastModifiedBy() default "N/A";
	// Note use of array
	String[] reviewers();
}
