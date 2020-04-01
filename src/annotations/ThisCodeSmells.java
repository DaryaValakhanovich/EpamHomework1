package annotations;

import java.lang.annotation.Repeatable;

@Repeatable(Reviewers.class)
public @interface ThisCodeSmells {
    String reviewer();
}
