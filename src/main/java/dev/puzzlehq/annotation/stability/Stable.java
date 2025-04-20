package dev.puzzlehq.annotation.stability;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the annotated element is finalized and is safe for external use.
 * Such elements will <strong>NOT</strong> be change or be removed without warning.
 *
 * @since 1.0.0
 * @author Mr-Zombii
 */
@Stable
@java.lang.annotation.Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE})
public @interface Stable {
}
