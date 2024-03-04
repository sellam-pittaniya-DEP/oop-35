package com.spring_security.api;

import com.spring_security.config.MethodSecurity;
import com.spring_security.util.*;

public class SecurityFilterChain {
    Interceptor interceptor;
    PostAuth postAuth;
    MethodSecurity methodSecurity;
}
