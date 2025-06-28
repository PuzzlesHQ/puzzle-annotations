package dev.puzzleshq.annotation.documentation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * A simple note that stays after compilation unlike a comment.

 * @author Mr-Zombii
 * @since 1.0.1
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
