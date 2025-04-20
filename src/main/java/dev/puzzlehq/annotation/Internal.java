package dev.puzzlehq.annotation;

import dev.puzzlehq.annotation.stability.Stable;

import java.lang.annotation.Documented;
import java.lang.annotation.*;

/**
 *
 * Indicates that the annotated element is not meant for usage
 * outside the project that the annotated element's housing jar/project.
 * Such elements may change or be removed at any time without warning.
 * <br>
 * <sub>Usage is similar to the stages usage of {@link dev.puzzlehq.annotation.stability.Unstable}.</sub>
 *
 * @since 1.0.0
 * @author Mr-Zombii
*/
@Stable
@Internal
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface Internal {
}
