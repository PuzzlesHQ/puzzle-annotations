package dev.puzzleshq.annotation.stability;

import java.lang.annotation.*;

/**
 * Indicates that the annotated element can be prone to error,
 * low predictability in its function, and is not ready for usage.
 * Such elements may change or be removed at any time without warning.
 *
 * @since 1.0.0
 * @author Mr-Zombii
 */
@Stable
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE})
public @interface Unstable {
}
