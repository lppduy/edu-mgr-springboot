package org.example.edumgr.constant;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UrlConstant {

    // Base API Prefix
    public static final String API_PREFIX = "/api";

    // Admin Base Prefix
    public static final String ADMIN_PREFIX = API_PREFIX + "/admin";

    // User Base Prefix
    public static final String USER_PREFIX = API_PREFIX + "/users";

    // Course Base Prefix
    public static final String COURSE_PREFIX = API_PREFIX + "/courses";

    // Lesson Base Prefix
    public static final String LESSON_PREFIX = API_PREFIX + "/lessons";
}

