package phanloaitamgiac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void classifyTriangleTest1() {
        int edge1 = 2;
        int edge2 = 2;
        int edge3 = 2;
        String actual = TriangleClassifier.classifyTriangle(edge1,edge2,edge3);
        String expected = "tam giác đều";

        assertEquals(expected,actual);
    }
    @Test
    void classifyTriangleTest2() {
        int edge1 = 2;
        int edge2 = 3;
        int edge3 = 2;
        String actual = TriangleClassifier.classifyTriangle(edge1,edge2,edge3);
        String expected = "tam giác cân";

        assertEquals(expected,actual);
    }
    @Test
    void classifyTriangleTest3() {
        int edge1 = 3;
        int edge2 = 4;
        int edge3 = 5;
        String actual = TriangleClassifier.classifyTriangle(edge1,edge2,edge3);
        String expected = "tam giác thường";

        assertEquals(expected,actual);
    }
    @Test
    void classifyTriangleTest4() {
        int edge1 = 8;
        int edge2 = 2;
        int edge3 = 3;
        String actual = TriangleClassifier.classifyTriangle(edge1,edge2,edge3);
        String expected = "không phải là tam giác";

        assertEquals(expected,actual);
    }
    @Test
    void classifyTriangleTest5() {
        int edge1 = -1;
        int edge2 = 2;
        int edge3 = 1;
        String actual = TriangleClassifier.classifyTriangle(edge1,edge2,edge3);
        String expected = "không phải là tam giác";

        assertEquals(expected,actual);
    }
    @Test
    void classifyTriangleTest6() {
        int edge1 = 0;
        int edge2 = 1;
        int edge3 = 1;
        String actual = TriangleClassifier.classifyTriangle(edge1,edge2,edge3);
        String expected = "không phải là tam giác";

        assertEquals(expected,actual);
    }
}