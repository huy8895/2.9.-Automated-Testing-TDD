package phanloaitamgiac;

public class TriangleClassifier {
    public static String classifyTriangle(int edge1,int edge2,int edge3){
        int maxEdge = findMax(edge1, edge2, edge3);
        int sumTwoShortEdge = getSumTwoShortEdge(edge1, edge2, edge3);
        boolean isTriangle = maxEdge < sumTwoShortEdge;
        boolean isEquilateral = (edge1 == edge2 && edge1 == edge3);
        boolean isIsosceles = (edge1 == edge2 || edge1 == edge3 || edge2 == edge3);

        if (!isTriangle)
            return "không phải là tam giác";
        else if (isEquilateral)
            return "tam giác đều";
        else if (isIsosceles)
            return "tam giác cân";
        else return "tam giác thường";

    }
    private static int findMax (int edge1, int edge2, int edge3){
        if (edge1 > edge2 && edge1 > edge3){
            return edge1;
        }else return Math.max(edge2, edge3);
    }
    private static int getSumTwoShortEdge(int edge1, int edge2, int edge3){
        if (edge1 > edge2 && edge1 > edge3){
            return edge2 + edge3;
        }else if (edge2 > edge3)
            return edge1 + edge3;
        else return edge1 + edge2;
    }
}
