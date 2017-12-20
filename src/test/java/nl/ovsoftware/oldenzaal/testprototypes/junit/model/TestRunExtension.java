package nl.ovsoftware.oldenzaal.testprototypes.junit.model;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.Optional;

public class TestRunExtension implements AfterTestExecutionCallback {

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {

        System.out.println("<test>");
        if(extensionContext.getExecutionException().isPresent()) {
            Throwable trace = extensionContext.getExecutionException().get();
            System.out.println("<exception>");
            trace.printStackTrace();
            System.out.println("</exception>");
        }
        Method method = extensionContext.getTestMethod().get();
        //walk through the annotations and print the Requirement annotation

        Annotation[] annotations = method.getDeclaredAnnotations();
        for(Annotation annotation : annotations) {
            if(annotation instanceof Requirement) {
                Requirement req = (Requirement) annotation;
                System.out.println("<req>" + req.RQ().toString() + "</req>");
            }
        }


        System.out.println("</test>");





    }
}
