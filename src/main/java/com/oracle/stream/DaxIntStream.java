package com.oracle.stream;

import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public interface DaxIntStream extends IntStream {

	@Override
	DaxIntStream filter(IntPredicate predicado);

	@Override
	DaxIntStream map(IntUnaryOperator operador);

	@Override
	DaxIntStream sequential();

	@Override
	DaxIntStream parallel();

	public static DaxIntStream of(int... datos) {
		return new DaxIntPipeline(datos);
	}
}
