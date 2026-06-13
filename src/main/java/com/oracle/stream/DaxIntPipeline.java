package com.oracle.stream;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.PrimitiveIterator.OfInt;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class DaxIntPipeline implements DaxIntStream {

	private IntStream fallbackStream;

	public DaxIntPipeline(int[] datos) {
		this.fallbackStream = IntStream.of(datos);
	}

	@Override
	public DaxIntStream filter(IntPredicate predicado) {
		fallbackStream = fallbackStream.filter(predicado);
		return this;
	}

	@Override
	public DaxIntStream map(IntUnaryOperator operador) {
		fallbackStream = fallbackStream.map(operador);
		return this;
	}

	@Override
	public DaxIntStream parallel() {
		fallbackStream = fallbackStream.parallel();
		return this;
	}

	@Override
	public DaxIntStream sequential() {
		fallbackStream = fallbackStream.sequential();
		return this;
	}

	@Override
	public boolean isParallel() {
		return fallbackStream.isParallel();
	}

	@Override
	public long count() {
		return fallbackStream.count();
	}

	@Override
	public int[] toArray() {
		return fallbackStream.toArray();
	}

	@Override
	public boolean allMatch(IntPredicate predicado) {
		return fallbackStream.allMatch(predicado);
	}

	@Override
	public boolean anyMatch(IntPredicate predicado) {
		return fallbackStream.anyMatch(predicado);
	}

	@Override
	public boolean noneMatch(IntPredicate predicado) {
		return fallbackStream.noneMatch(predicado);
	}

	@Override
	public DoubleStream asDoubleStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LongStream asLongStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OptionalDouble average() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Integer> boxed() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <R> R collect(Supplier<R> arg0, ObjIntConsumer<R> arg1, BiConsumer<R, R> arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IntStream distinct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OptionalInt findAny() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OptionalInt findFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IntStream flatMap(IntFunction<? extends IntStream> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void forEach(IntConsumer arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void forEachOrdered(IntConsumer arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public OfInt iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IntStream limit(long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DoubleStream mapToDouble(IntToDoubleFunction arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LongStream mapToLong(IntToLongFunction arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <U> Stream<U> mapToObj(IntFunction<? extends U> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OptionalInt max() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OptionalInt min() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IntStream peek(IntConsumer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OptionalInt reduce(IntBinaryOperator arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int reduce(int arg0, IntBinaryOperator arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IntStream skip(long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IntStream sorted() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public java.util.Spliterator.OfInt spliterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int sum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IntSummaryStatistics summaryStatistics() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	@Override
	public IntStream onClose(Runnable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IntStream unordered() {
		// TODO Auto-generated method stub
		return null;
	}

	// For every other IntStream method, delegate to fallbackStream.
}
