package io.smallrye.converters;

/**
 * A converter which wraps another converter (possibly of a different type).
 */
public abstract class AbstractDelegatingConverter<I, O> extends AbstractConverter<O> {
    private static final long serialVersionUID = 7514544475086344689L;

    private final Converter<? extends I> delegate;

    protected AbstractDelegatingConverter(final Converter<? extends I> delegate) {
        this.delegate = delegate;
    }

    protected Converter<? extends I> getDelegate() {
        return delegate;
    }
}
