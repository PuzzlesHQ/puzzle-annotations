package dev.puzzleshq.annotation.documentation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * A simple note that stays after compilation unlike a comment.

 * @since 1.0.1
 * @author Mr-Zombii
 */
@Retention(RetentionPolicy.CLASS)
public @interface Note {

    /**
     * The note to leave in the compiled build.
     *
     * @return Text of your choosing.
     */
    String value();

}
