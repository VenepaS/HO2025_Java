package Sparta;

import com.sparta.VenepaS.FilmClassification;
import com.sparta.VenepaS.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Filmclassification {
    @Test
    @DisplayName("ageviwer as 11")
    public void MyFirstfilmtest() {
        int Age = 11;
        String Expected = "U, PG & 12 films are available.";
        String actual = FilmClassification.getClassificationsByAge(Age);
        Assertions.assertEquals(Expected, actual);
    }
@Test
        @DisplayName("ageviewer as 14")
        public void Mysecondfilmtest() {
    int Age = 14;
    String Expected = "U, PG, 12 & 15 films are available.";
    String actual = FilmClassification.getClassificationsByAge(Age);
    Assertions.assertEquals(Expected, actual);
}
            @Test
            @DisplayName("ageviewer as 15")
            public void Mythirdfilmtest() {
                int Age = 15;
                String Expected = "All films are available.";
                String actual = FilmClassification.getClassificationsByAge(Age);
                Assertions.assertEquals(Expected, actual);
    }
}
