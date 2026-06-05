/*
 * Copyright 2012-2026 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.assertj.tests.core.testkit;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import org.jspecify.annotations.Nullable;

// dummy stream for testing purpose
public class StringStream implements Stream<String> {

  @Override
  public @Nullable Iterator<String> iterator() {
    return null;
  }

  @Override
  public @Nullable Spliterator<String> spliterator() {
    return null;
  }

  @Override
  public boolean isParallel() {
    return false;
  }

  @Override
  public @Nullable Stream<String> sequential() {
    return null;
  }

  @Override
  public @Nullable Stream<String> parallel() {
    return null;
  }

  @Override
  public @Nullable Stream<String> unordered() {
    return null;
  }

  @Override
  public @Nullable Stream<String> onClose(Runnable closeHandler) {
    return null;
  }

  @Override
  public void close() {}

  @Override
  public @Nullable Stream<String> filter(Predicate<? super String> predicate) {
    return null;
  }

  @Override
  public <R> @Nullable Stream<R> map(Function<? super String, ? extends R> mapper) {
    return null;
  }

  @Override
  public @Nullable IntStream mapToInt(ToIntFunction<? super String> mapper) {
    return null;
  }

  @Override
  public @Nullable LongStream mapToLong(ToLongFunction<? super String> mapper) {
    return null;
  }

  @Override
  public @Nullable DoubleStream mapToDouble(ToDoubleFunction<? super String> mapper) {
    return null;
  }

  @Override
  public <R> @Nullable Stream<R> flatMap(Function<? super String, ? extends Stream<? extends R>> mapper) {
    return null;
  }

  @Override
  public @Nullable IntStream flatMapToInt(Function<? super String, ? extends IntStream> mapper) {
    return null;
  }

  @Override
  public @Nullable LongStream flatMapToLong(Function<? super String, ? extends LongStream> mapper) {
    return null;
  }

  @Override
  public @Nullable DoubleStream flatMapToDouble(Function<? super String, ? extends DoubleStream> mapper) {
    return null;
  }

  @Override
  public @Nullable Stream<String> distinct() {
    return null;
  }

  @Override
  public @Nullable Stream<String> sorted() {
    return null;
  }

  @Override
  public @Nullable Stream<String> sorted(Comparator<? super String> comparator) {
    return null;
  }

  @Override
  public @Nullable Stream<String> peek(Consumer<? super String> action) {
    return null;
  }

  @Override
  public @Nullable Stream<String> limit(long maxSize) {
    return null;
  }

  @Override
  public @Nullable Stream<String> skip(long n) {
    return null;
  }

  @Override
  public void forEach(Consumer<? super String> action) {}

  @Override
  public void forEachOrdered(Consumer<? super String> action) {}

  @Override
  public Object @Nullable[] toArray() {
    return null;
  }

  @Override
  public <A> A @Nullable[] toArray(IntFunction<A[]> generator) {
    return null;
  }

  @Override
  public @Nullable String reduce(String identity, BinaryOperator<String> accumulator) {
    return null;
  }

  @Override
  public @Nullable Optional<String> reduce(BinaryOperator<String> accumulator) {
    return null;
  }

  @Override
  public <U> @Nullable U reduce(U identity, BiFunction<U, ? super String, U> accumulator, BinaryOperator<U> combiner) {
    return null;
  }

  @Override
  public <R> @Nullable R collect(Supplier<R> supplier, BiConsumer<R, ? super String> accumulator, BiConsumer<R, R> combiner) {
    return null;
  }

  @Override
  public <R, A> @Nullable R collect(Collector<? super String, A, R> collector) {
    return null;
  }

  @Override
  public @Nullable Optional<String> min(Comparator<? super String> comparator) {
    return null;
  }

  @Override
  public @Nullable Optional<String> max(Comparator<? super String> comparator) {
    return null;
  }

  @Override
  public long count() {
    return 0;
  }

  @Override
  public boolean anyMatch(Predicate<? super String> predicate) {
    return false;
  }

  @Override
  public boolean allMatch(Predicate<? super String> predicate) {
    return false;
  }

  @Override
  public boolean noneMatch(Predicate<? super String> predicate) {
    return false;
  }

  @Override
  public @Nullable Optional<String> findFirst() {
    return null;
  }

  @Override
  public @Nullable Optional<String> findAny() {
    return null;
  }
}
