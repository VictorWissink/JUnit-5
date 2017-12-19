package nl.ovsoftware.oldenzaal.testprototypes.junit.model;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.Optional;

public class TestRunExtension implements AfterTestExecutionCallback {

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {


        String trace = extensionContext.getExecutionException().toString();
//        String stackTrace = extensionContext.getExecutionException()
        Optional<Method> requirement = extensionContext.getTestMethod();
        String testcase = extensionContext.getElement().toString();

        System.out.println("||||||||Exception: " + trace + " .    Annotated with: " + requirement.toString() + "   |||||||||||||||||");

        Method method = extensionContext.getTestMethod().get();
        System.out.println("annotations: " + method.getDeclaredAnnotations()[2].toString());


    }
}
