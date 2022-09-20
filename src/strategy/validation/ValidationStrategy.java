package strategy.validation;

@FunctionalInterface
public interface ValidationStrategy {
    boolean execute(String s);
}
