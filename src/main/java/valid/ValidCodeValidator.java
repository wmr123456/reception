//package valid;
//
//import org.springframework.http.server.ServletServerHttpRequest;
//
//import javax.servlet.ServletContext;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.validation.ConstraintValidator;
//import javax.validation.ConstraintValidatorContext;
//
///**
// * Created by Administrator on 2014/12/26.
// */
//public class ValidCodeValidator implements ConstraintValidator<ValidCode, String> {
////    private String valid_reg = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";//正则表达式
////    private Pattern myPattern = Pattern.compile(valid_reg);
//
//    @Override
//    public void initialize(ValidCode constraintAnnotation) {
//
//    }
//
//    @Override
//    public boolean isValid(String value, ConstraintValidatorContext context){;
//        String volid =(String)request.getSession(true).getAttribute("rand");
//        if (value == null){
//            return true; //无值时不校验
//        }
//        return myPattern.matcher(value.toString()).matches();
//    }
//}
