package checknumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class test {

    @Test
    public void checkNumbersOption1(){
        CheckNumbers checkOption1 = new CheckNumbers();
        assertEquals(1,checkOption1.option1('1'));
    }
    @Test
    public void checkIfItIsTrueOption1(){
        CheckNumbers checkIfItIsOption1 = new CheckNumbers();
        assertEquals(-1,checkIfItIsOption1.option1('a'));
    }
    @Test
    public void checkNumbersOption2(){
        CheckNumbers checkOption2 = new CheckNumbers();
        assertEquals(3,checkOption2.option1('3'));
    }
    @Test
    public void checkIfItIsTrueOption2(){
        CheckNumbers checkIfItIsOption2 = new CheckNumbers();
        assertEquals(-1,checkIfItIsOption2.option1('b'));
    }
}
