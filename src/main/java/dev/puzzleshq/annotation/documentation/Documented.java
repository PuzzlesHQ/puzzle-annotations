package dev.puzzleshq.annotation.documentation;

import dev.puzzleshq.annotation.stability.Stable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A marked to display if something is documented.
 *
 * @since 1.0.0
 * @author Mr-Zombii
 */
@Stable
@java.lang.annotation.Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE})
public @interface Documented {
}
