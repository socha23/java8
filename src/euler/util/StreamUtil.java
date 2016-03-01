/***********************************************************
 * Autorskie Prawa Majatkowe -
 * Agencja Restrukturyzacji i Modernizacji Rolnictwa (ARiMR).
 * <p>
 * Copyright 2016 The Agency for Restructuring and
 * Modernisation of Agriculture (ARMA).
 * ***********************************************************
 * Opis: patrz ni¿ej w komentarzach javadoc.
 * ***********************************************************
 * Osoba odpowiedzialna: Przemys³aw Socha
 ***********************************************************/

package euler.util;

import java.util.PrimitiveIterator;
import java.util.Spliterators;
import java.util.function.*;
import java.util.stream.LongStream;
import java.util.stream.StreamSupport;

public class StreamUtil {

    public static LongStream takeWhile(LongStream stream, LongPredicate predicate)
    {
        return StreamSupport.longStream(new PredicateLongSpliterator(stream, predicate), false);
    }

    private static class PredicateLongSpliterator extends Spliterators.AbstractLongSpliterator
    {
        private final PrimitiveIterator.OfLong iterator;
        private final LongPredicate predicate;

        public PredicateLongSpliterator(LongStream stream, LongPredicate predicate)
        {
            super(Long.MAX_VALUE, IMMUTABLE);
            this.iterator = stream.iterator();
            this.predicate = predicate;
        }

        @Override
        public boolean tryAdvance(LongConsumer action)
        {
            if (iterator.hasNext()) {
                long value = iterator.nextLong();
                if (predicate.test(value)) {
                    action.accept(value);
                    return true;
                }
            }

            return false;
        }
    }
}
