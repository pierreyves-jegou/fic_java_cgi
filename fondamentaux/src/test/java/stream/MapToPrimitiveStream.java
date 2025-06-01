package stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapToPrimitiveStream {


    @Test
    void mapToPrimitiveStream(){
        // Given
        Stream<Integer> integerStream = Stream.of(5, 10, 5 , 10);

        IntStream intStream = null; //TODO

        OptionalDouble maybeAverage = intStream.average();
        Assertions.assertEquals(7.5d, maybeAverage.getAsDouble());


    }

}
