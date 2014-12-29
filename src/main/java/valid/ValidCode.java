//package valid;
///**
// * Created by Administrator on 2014/12/26.
// */
//import javax.validation.Constraint;
//import javax.validation.Payload;
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//
//@Target({ElementType.FIELD, ElementType.METHOD})
//@Retention(RetentionPolicy.RUNTIME)
//@Constraint(validatedBy= ValidCodeValidator.class)
//public @interface ValidCode {
//    String message() default"你输入的验证码不正确请检查";
//    Class<?>[] groups() default {};
//    Class<? extends Payload>[] payload() default {};
//}
