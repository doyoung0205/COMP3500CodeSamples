package academy.pocu.comp3500samples.w02.sumtailrecursive;

import java.util.stream.Stream;

@FunctionalInterface
public interface TailCall<T> {
    TailCall<T> apply();

    default boolean isComplete() {
        return false;
    }

    default T result() {
        throw new Error("not implemented");
    }

    default T invoke() {
        return Stream.iterate(this, TailCall::apply)
                .filter(TailCall::isComplete)
                .findFirst().orElseThrow(() -> new Error("not found"))
                .result();

    }
}
