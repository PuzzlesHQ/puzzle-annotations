package dev.puzzleshq.annotation.documentation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Mr-Zombii
 * @since 1.0.1
 *
 * A simple note that stays after compilation unlike a comment.
 */
@Retention(RetentionPolicy.CLASS)
public @interface Note {

    String value();

}
