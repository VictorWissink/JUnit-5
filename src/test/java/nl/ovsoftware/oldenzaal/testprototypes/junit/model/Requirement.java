package nl.ovsoftware.oldenzaal.testprototypes.junit.model;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//annotation for adding requirements to test cases. Add by placing @Requirement({REQUIREMNTCODE}-{TESTCASECODE} example: @Requirement("CBM32-1A")
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD) //can use in method only.
public @interface Requirement {
    public String RQ() default "";
}
