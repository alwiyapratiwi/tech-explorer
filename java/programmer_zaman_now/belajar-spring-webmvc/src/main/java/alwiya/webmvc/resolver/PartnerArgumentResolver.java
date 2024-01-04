package alwiya.webmvc.resolver;

import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import alwiya.webmvc.model.Partner;
import jakarta.servlet.http.HttpServletRequest;

@Component
public class PartnerArgumentResolver implements HandlerMethodArgumentResolver {

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest,
            WebDataBinderFactory webDataBinderFactory) throws Exception {
                
        HttpServletRequest servletRequest = (HttpServletRequest) webRequest.getNativeRequest();
        String apiKey = servletRequest.getHeader("X-API-KEY");

        if(apiKey != null) {
            // query database
            return new Partner(apiKey, "Sample Partner");
        }

        throw new RuntimeException("Unauthorized Exception");
    }

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.getParameterType().equals(Partner.class);
    }
    
}
