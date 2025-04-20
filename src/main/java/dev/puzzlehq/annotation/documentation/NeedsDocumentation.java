package dev.puzzlehq.annotation.documentation;

import dev.puzzlehq.annotation.stability.Stable;

import java.lang.annotation.*;
import java.lang.annotation.Documented;

/**
 * <p>
 * Indicates that the annotated element requires proper documentation.
 * </p>
 * <sub>If you need help with the element, please contact the devs of the project.</sub>
 *
 * @since 1.0.0
 * @author Mr-Zombii
 */
@Stable
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface NeedsDocumentation {
}
