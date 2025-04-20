package dev.puzzlehq.annotation.stability;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the annotated element is in an early stage of development, and
 * It may behave unpredictably or be changed or removed in future versions.
 *
 * @since 1.0.0
 * @author Mr-Zombii
 */
@Stable
@java.lang.annotation.Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE})
public @interface Experimental {
    
}
