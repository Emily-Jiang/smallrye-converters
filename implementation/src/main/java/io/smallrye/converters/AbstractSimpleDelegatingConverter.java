package io.smallrye.converters;

/**
 * A converter which wraps another converter of the same type.
 */
public abstract class AbstractSimpleDelegatingConverter<T> extends AbstractDelegatingConverter<T, T> {
    private static final long serialVersionUID = 8320492892722511026L;

    protected AbstractSimpleDelegatingConverter(final Converter<? extends T> delegate) {
        super(delegate);
    }
}
