package study.spring.boot.example.springbootproject.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Configuration;
import study.spring.boot.example.springbootproject.filter.CustomFilter;

@Configuration
public class FilterConfig {

    public FilterRegistrationBean<CustomFilter> registrationBean() {
        FilterRegistrationBean<CustomFilter> registrationBean = new FilterRegistrationBean<>();

        registrationBean.setFilter(new CustomFilter());
        registrationBean.addUrlPatterns("/customers/*");

        return registrationBean;
    }
}
