package net.javaguides.banking;

import io.micrometer.common.KeyValues;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

@SpringBootApplication
public class BankingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingAppApplication.class, args);
	}


	public void learnStream(){
		Stream<T> stream =new Stream<T>() {
			@Override
			public Stream<T> filter(Predicate<? super T> predicate) {
				List<String> result = listOfLists.stream()
						.flatMap(List::stream)               // Flatten the list of lists into a single stream
						.filter(s -> s.startsWith("S"))      // Filter elements starting with "S"
						.map(String::toUpperCase)            // Transform each element to uppercase
						.distinct()                          // Remove duplicate elements
						.sorted()                            // Sort elements
						.peek(s -> intermediateResults.add(s)) // Perform an action (add to set) on each element
						.collect(Collectors.toList());
			}

			@Override
			public <R> Stream<R> map(Function<? super T, ? extends R> mapper) {
				return Stream.empty();
			}

			@Override
			public IntStream mapToInt(ToIntFunction<? super T> mapper) {
				return IntStream.empty();
			}

			@Override
			public LongStream mapToLong(ToLongFunction<? super T> mapper) {
				return LongStream.empty();
			}

			@Override
			public DoubleStream mapToDouble(ToDoubleFunction<? super T> mapper) {
				return DoubleStream.empty();
			}

			@Override
			public <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper) {
				return Stream.empty();
			}

			@Override
			public IntStream flatMapToInt(Function<? super T, ? extends IntStream> mapper) {
				return IntStream.empty();
			}

			@Override
			public LongStream flatMapToLong(Function<? super T, ? extends LongStream> mapper) {
				return LongStream.empty();
			}

			@Override
			public DoubleStream flatMapToDouble(Function<? super T, ? extends DoubleStream> mapper) {
				return DoubleStream.empty();
			}

			@Override
			public Stream<T> distinct() {
				return Stream.empty();
			}

			@Override
			public Stream<T> sorted() {
				return Stream.empty();
			}

			@Override
			public Stream<T> sorted(Comparator<? super T> comparator) {
				return Stream.empty();
			}

			@Override
			public Stream<T> peek(Consumer<? super T> action) {
				return Stream.empty();
			}

			@Override
			public Stream<T> limit(long maxSize) {
				return Stream.empty();
			}

			@Override
			public Stream<T> skip(long n) {
				return Stream.empty();
			}

			@Override
			public void forEach(Consumer<? super T> action) {

			}

			@Override
			public void forEachOrdered(Consumer<? super T> action) {

			}

			@Override
			public Object[] toArray() {
				return new Object[0];
			}

			@Override
			public <A> A[] toArray(IntFunction<A[]> generator) {
				return null;
			}

			@Override
			public T reduce(T identity, BinaryOperator<T> accumulator) {
				return null;
			}

			@Override
			public Optional<T> reduce(BinaryOperator<T> accumulator) {
				return Optional.empty();
			}

			@Override
			public <U> U reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner) {
				return null;
			}

			@Override
			public <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner) {
				return null;
			}

			@Override
			public <R, A> R collect(Collector<? super T, A, R> collector) {
				return null;
			}

			@Override
			public Optional<T> min(Comparator<? super T> comparator) {
				return Optional.empty();
			}

			@Override
			public Optional<T> max(Comparator<? super T> comparator) {
				return Optional.empty();
			}

			@Override
			public long count() {
				return 0;
			}

			@Override
			public boolean anyMatch(Predicate<? super T> predicate) {
				return false;
			}

			@Override
			public boolean allMatch(Predicate<? super T> predicate) {
				return false;
			}

			@Override
			public boolean noneMatch(Predicate<? super T> predicate) {
				return false;
			}

			@Override
			public Optional<T> findFirst() {
				return Optional.empty();
			}

			@Override
			public Optional<T> findAny() {
				return Optional.empty();
			}

			@Override
			public Iterator<T> iterator() {
				return null;
			}

			@Override
			public Spliterator<T> spliterator() {
				return null;
			}

			@Override
			public boolean isParallel() {
				return false;
			}

			@Override
			public Stream<T> sequential() {
				return Stream.empty();
			}

			@Override
			public Stream<T> parallel() {
				return Stream.empty();
			}

			@Override
			public Stream<T> unordered() {
				return Stream.empty();
			}

			@Override
			public Stream<T> onClose(Runnable closeHandler) {
				return Stream.empty();
			}

			@Override
			public void close() {

			}
		}
    }

}
