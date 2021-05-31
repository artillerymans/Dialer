package com.android.dialer.proguard;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Denotes that the class, constructor, method or field is used for reflection and therefore cannot
 * be removed by tools like ProGuard. Use the value parameter to mention a file that uses the
 * component marked as UsedByReflection.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.FIELD})
public @interface UsedByReflection {

    String value();
}
